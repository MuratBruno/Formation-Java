package com.aplose.smooss.services;

import java.sql.SQLException;

import com.aplose.smooss.dao.IEventDAO;
import com.aplose.smooss.dao.impl.EventDAO;
import com.aplose.smooss.model.Event;

public class EventService {
	IEventDAO eventDAO = new EventDAO();
	public void create(Event evt) {

		
		
	}
	
	public Event read(long id) {
		Event evt=null;
		try {
			evt = eventDAO.read(id);
		} catch (SQLException e) {
				System.out.println("Attention l'évènement qui a pour ID " +id + " n'existe pas...");
				e.printStackTrace();
		}
		return evt;
	}

}
