package com.aplose.smooss.dao;

import java.sql.SQLException;

public interface IDAO<T> {
	public void create (T t);
	public T read (long id)  throws SQLException;
	public void update(T t);
	public void delete(T t);
}
