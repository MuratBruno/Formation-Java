package com.aplose.formationdao;

import java.sql.SQLException;

import com.aplose.smooss.dao.JDBCSingleton;
import com.aplose.smooss.model.Event;
import com.aplose.smooss.services.EventService;

public class TestEventService {
	static EventService evtService = new EventService();

	public static void main(String[] args) {
		Event evt = evtService.read(1);
		
		if(evt != null) {
			System.out.println("Event id : " +evt.getId());
			System.out.println("Name : " +evt.getName());
			System.out.println("Description : " +evt.getDescription());
			System.out.println("Localisation : " +evt.getLocalisation());
			System.out.println("Start : " +evt.getStart());
			System.out.println("End : " +evt.getEnd());
			System.out.print("");

		}
		else {
			System.out.println("Aucune valeur retournée");
		}
		
		Event evt2 = evtService.read(2);
		
		if(evt2 != null) {
			System.out.println("Event id : " +evt2.getId());
			System.out.println("Name : " +evt2.getName());
			System.out.println("Description : " +evt2.getDescription());
			System.out.println("Localisation : " +evt2.getLocalisation());
			System.out.println("Start : " +evt2.getStart());
			System.out.println("End : " +evt2.getEnd());
			System.out.print("");

		}
		
		try {
			JDBCSingleton.getInstance().getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
