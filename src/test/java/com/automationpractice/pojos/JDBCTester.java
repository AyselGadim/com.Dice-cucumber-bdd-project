package com.automationpractice.pojos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) throws SQLException {

		String user = "duotech";
		String password = "duotech2020";

		String url = "jdbc:mysql://dtdatabase.c6qqyddfk30u.us-east-2.rds.amazonaws.com/employees";

		Connection connection  = DriverManager.getConnection(url, user, password);

		System.out.println("Database connection established");
		
		Statement statement  = connection.createStatement(); //Creates s statement object for sending SQL statements to the database. 

		
		String query  = "SELECT * FROM employees";
		
		statement.executeQuery(query);
		
		ResultSet rs = statement.executeQuery(query);
		
		rs.next();
		
		//System.out.println(rs.getObject(rs.getObject(4)));
		
		while (rs.next()) {
			System.out.println(rs.getObject("first_name") + "\t" + ("last_name"));
		}
	}

}
