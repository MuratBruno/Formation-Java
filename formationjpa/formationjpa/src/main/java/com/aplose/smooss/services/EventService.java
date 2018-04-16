package com.aplose.smooss.services;

import com.aplose.formationjpa.JPASingleton;
import com.aplose.smooss.model.Event;


public class EventService{
	
	private static EventService INSTANCE;
	
	private EventService() {}

	public EventService getInstantce() {
		if (INSTANCE == null) {
			INSTANCE = new EventService();
		}
		
		return INSTANCE;
	}
	
	public Event read(long id) {
		Event evt = JPASingleton.getInstance().getEntityManager().find(Event.class, id);
		return evt;
	}

}