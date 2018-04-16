package com.aplose.smooss.dao;

import com.aplose.smooss.model.Event;

import java.util.List;
import java.sql.SQLException;
import java.sql.Timestamp;

public interface IEventDAO extends IDAO<Event>{
	
	public List<Event> findByDateRange(Timestamp date1, Timestamp date2) throws SQLException;  
	
}