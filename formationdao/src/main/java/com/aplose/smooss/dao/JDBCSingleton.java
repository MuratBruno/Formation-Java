package com.aplose.smooss.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCSingleton {
	private static JDBCSingleton INSTANCE;

	private Connection connection;

	private JDBCSingleton() {
		Properties config = new Properties();
		try {
			config.load(new FileInputStream("jdbc.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		/*
		 * String url = "jdbc:mysql://localhost:3306/smooss"; String user = "smooss";
		 * String password = "Formation01";
		 */

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName(config.getProperty("driver"));
			connection = DriverManager.getConnection(config.getProperty("url"), config.getProperty("user"),
					config.getProperty("password"));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static JDBCSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new JDBCSingleton();
		}
		return INSTANCE;
	}

	public Connection getConnection() {
		return connection;
	}

}
