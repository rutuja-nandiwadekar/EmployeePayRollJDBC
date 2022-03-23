package com.blz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DatabaseConnector {

	public static void main(String[] args) {
		// defined jdbc url, username, password
		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service";
		String userName = "root";
		String password = "password";
		// establish connection
		Connection connection = null;

		// Driver is loaded or not
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loading the Driver class
			System.out.println("Driver loaded.");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("can not find the driver in classpath ..", e);
		}

		// list all the drivers
		listDrivers();

		try {
			System.out.println("Connecting to database:" + jdbcURL);
			connection = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection established successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// what are the drivers reg in classpath
	private static void listDrivers() {
		Enumeration<Driver> listDrivers = DriverManager.getDrivers();

		while (listDrivers.hasMoreElements()) {
			Driver driverClass = listDrivers.nextElement();
			System.out.println("" + driverClass.getClass().getName());
		}
	}
}
