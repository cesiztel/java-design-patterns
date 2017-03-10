package com.pattern.observer;

public class DiscussionParticipant implements IObserver {
	private String name;
	private ISubject topic;
	
	public DiscussionParticipant(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		String msg = (String) this.topic.getUpdate(this);
		if(msg == null) {
			System.out.println(name + ":: No new message");
			
			return;
		}
		
		System.out.println(name + ":: Consuming message::" + msg);
	}

	@Override
	public void setSubject(ISubject sub) {
		this.topic = sub;
	}
}
