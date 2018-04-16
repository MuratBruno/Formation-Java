package com.aplose.formationjpa;

import com.aplose.smooss.model.Event;
import com.aplose.smooss.services.EventServiceSingleton;

/**
 * Creation Evenements persistant en utilisant JPA
 *
 */
public class App {
	public static void main( String[] args )
    {
		Event e = new Event();
		e.setName("First Event");
		e.setDescription("Description de l'event");
		
		EventServiceSingleton.getInstance().create(e);
		
		long id = e.getId();
		
		System.out.println("ID de l'évent crée : " + id);
		
		e = EventServiceSingleton.getInstance().read(id);
		
		System.out.println("Event Name : " + e.getName());
		
		JPASingleton.getInstance().close();
    }
}
