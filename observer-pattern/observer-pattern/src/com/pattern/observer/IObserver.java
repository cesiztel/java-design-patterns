package com.pattern.observer;

public interface IObserver {
	
	public void update();
	
	public void setSubject(ISubject sub);
}
