package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DiscussionTopic implements ISubject {
	private List<IObserver> observers;
	private String message;
	
	public DiscussionTopic() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void register(IObserver obj) {
		if(obj == null) { return; }
		
		observers.add(obj);
	}

	@Override
	public void unregister(IObserver obj) {
		if(obj == null) { return; }
		
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer: observers) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(IObserver obj) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted on topic:" + msg);
		this.message = msg;
		
		notifyObservers();
	}
}
