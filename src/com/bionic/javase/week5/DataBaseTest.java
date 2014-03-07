package com.bionic.javase.week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseTest {

	public static void main(String[] args) {
		final String derbyProtocol = "jdbc:derby://localhost:1527/";
		final String dbName = "data";
		final String jdbcURL = derbyProtocol + dbName;
		final String derbyDriver = "org.apache.derby.jdbc.ClientDriver";
		final String driver = derbyDriver;
		System.setProperty("jdbc.drivers", driver);

		String query = "SELECT * from programs where id=?";
		String id = "1";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, "app",
					"root");
			PreparedStatement statement = conn.prepareStatement(query);
			conn.setAutoCommit(false);
			ResultSet rs = null;
			try {
				statement = conn.prepareStatement(query);
				statement.setString(1, id);
				rs = statement.executeQuery();
				while (rs.next()) {

					System.out.println("Name: " + rs.getString("title"));
					System.out.println("Short description: "
							+ rs.getString("shortdescription"));
					System.out.println("Full description: "
							+ rs.getString("fulldescription"));
					System.out
							.println("*****************************************************");
				}
			} finally {
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
			}
		} catch (SQLException se) {
			System.out.println("SQL Error: " + se);
		}

	}

}
