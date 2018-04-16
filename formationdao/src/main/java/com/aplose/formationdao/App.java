// CONNECTION SQL EN JAVA AVEC JDBC

package com.aplose.formationdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.aplose.smooss.dao.JDBCSingleton;

public class App {
	public static void main(String[] args) {
		String dbName = null;
		String dbVersion = null;
		Integer dbVersionn = null;
		Integer dbRelease = null;
		String driverName = null;
		String driverVersion = null;
		Integer driverVersionn = null;
		Integer driverRelease = null;
		ResultSet clientP = null;
		ResultSet catalogs = null;

		try {
			
			dbName = JDBCSingleton.getInstance().getConnection().getMetaData().getDatabaseProductName();
			dbVersion = JDBCSingleton.getInstance().getConnection().getMetaData().getDatabaseProductVersion();
			dbVersionn = JDBCSingleton.getInstance().getConnection().getMetaData().getDatabaseMajorVersion();
			dbRelease = JDBCSingleton.getInstance().getConnection().getMetaData().getDatabaseMinorVersion();
			driverName = JDBCSingleton.getInstance().getConnection().getMetaData().getDriverName();
			driverVersion = JDBCSingleton.getInstance().getConnection().getMetaData().getDriverVersion();
			driverVersionn = JDBCSingleton.getInstance().getConnection().getMetaData().getDriverMajorVersion();
			driverRelease = JDBCSingleton.getInstance().getConnection().getMetaData().getDriverMinorVersion();
			clientP = JDBCSingleton.getInstance().getConnection().getMetaData().getClientInfoProperties();
			catalogs = JDBCSingleton.getInstance().getConnection().getMetaData().getCatalogs();
			


			System.out.println("");
			System.out.println("OUVERTURE CONNEXION AU SERVEUR MYSQL");
			System.out.println("");
			System.out.println("INFOS SERVEUR MYSQL");
			System.out.println("");
			System.out.println("SERVEUR DE BDD : " + dbName);
			System.out.println("VERSION COMPLETE : " + dbVersion);
			System.out.println("VERSION : " + dbVersionn);
			System.out.println("RELEASE : " + dbRelease);
			System.out.println("");
			System.out.println("DRIVER : " + driverName);
			System.out.println("VERSION COMPLETE : " + driverVersion);
			System.out.println("VERSION : " + driverVersionn);
			System.out.println("RELEASE : " + driverRelease);
			System.out.println("");
			System.out.println("INFOS CLIENT JDBC");
			System.out.println("");
			System.out.println(clientP);
			System.out.println("");
			System.out.println("INFOS CATALOGUES");
			System.out.println("");
			System.out.println(catalogs);

			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}