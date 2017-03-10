package com.pattern.observer;

public class Discussion {

	public static void main(String[] args) {
		// Create a new DiscussionTopic
		DiscussionTopic topic = new DiscussionTopic();
		
		// Create participants
		DiscussionParticipant participant1 = new DiscussionParticipant("Participant 1");
		DiscussionParticipant participant2 = new DiscussionParticipant("Participant 2");
		DiscussionParticipant participant3 = new DiscussionParticipant("Participant 3");
		DiscussionParticipant participant4 = new DiscussionParticipant("Participant 4");
		DiscussionParticipant participant5 = new DiscussionParticipant("Participant 5");
		
		// register to the topic discussion
		topic.register(participant1);
		topic.register(participant2);
		topic.register(participant3);
		topic.register(participant4);
		topic.register(participant5);
		
		// Attach observer to the topic discussion
		participant1.setSubject(topic);
		participant2.setSubject(topic);
		participant3.setSubject(topic);
		participant4.setSubject(topic);
		participant5.setSubject(topic);
		
		// Check for updates
		participant1.update();
		
		// Send new message
		topic.postMessage("This is an awesome new message!");
		
		/**
		 * We can now for instance create a list of topics where
		 * the participants are subscribed and get message from
		 * different topics. 
		 */
	}

}