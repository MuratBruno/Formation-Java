package com.aplose.smooss.services;

import com.aplose.formationjpa.JPASingleton;
import com.aplose.smooss.model.Event;


public class EventServiceSingleton {
	
	private EventServiceSingleton() {}
	
	private static EventServiceSingleton INSTANCE;
	
	public static EventServiceSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EventServiceSingleton();
		}
		return INSTANCE;
	}
	
	public void create(Event evt) {
		JPASingleton.getInstance().getEntityManager().getTransaction().begin();
		JPASingleton.getInstance().getEntityManager().persist(evt);
		JPASingleton.getInstance().getEntityManager().getTransaction().commit();
	}
	
	public Event read(long id) {
		Event evt = JPASingleton.getInstance().getEntityManager().find(Event.class, id);
		return evt;
	}

}
