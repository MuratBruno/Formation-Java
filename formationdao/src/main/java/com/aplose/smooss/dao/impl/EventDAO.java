package com.aplose.smooss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.aplose.smooss.dao.IEventDAO;
import com.aplose.smooss.dao.JDBCSingleton;
import com.aplose.smooss.model.Event;

public class EventDAO implements IEventDAO {
	PreparedStatement pstRead = null;
	PreparedStatement pstFindByDateRange = null;

	public void create(Event t) {
		// TODO Auto-generated method stub

	}
	
	private Event newEventFromRS(ResultSet rs) throws SQLException {
		Event event = new Event();
		event.setId(rs.getLong("id"));
		event.setName(rs.getString("name"));
		event.setDescription(rs.getString("description"));
		event.setLocalisation(rs.getString("localisation"));
		event.setStart(rs.getTimestamp("start"));
		event.setEnd(rs.getTimestamp("end"));	
		return event;
	}

	public Event read(long id) throws SQLException {
		
		Event event= null;
		if (pstRead == null) {
			pstRead = JDBCSingleton.getInstance().getConnection().prepareStatement("SELECT id, name, description, localisation, start, end FROM event WHERE id=?");
		}
		pstRead.setLong(1, id);
		ResultSet rs = pstRead.executeQuery();
		
		if(rs.next()) {
			event = newEventFromRS(rs);
		}

		return event;
	}

	public void update(Event t) {
		// TODO Auto-generated method stub

	}

	public void delete(Event t) {
		// TODO Auto-generated method stub

	}

	public List<Event> findByDateRange(Timestamp date1, Timestamp date2) throws SQLException {
		String query = "SELECT id, name, description, localisation, start, end FROM event WHERE start BETWEEN ? AND ?";
		if(pstFindByDateRange == null) {
			pstFindByDateRange = JDBCSingleton.getInstance().getConnection().prepareStatement(query);
			
		}
		pstFindByDateRange.setTimestamp(1, date1);
		pstFindByDateRange.setTimestamp(2, date2);
		ResultSet rs = pstFindByDateRange.executeQuery();
		List<Event> events = new ArrayList<Event>(); 
		while(rs.next()) {
			events.add(newEventFromRS(rs));
		}
		
		return events;
	}

}