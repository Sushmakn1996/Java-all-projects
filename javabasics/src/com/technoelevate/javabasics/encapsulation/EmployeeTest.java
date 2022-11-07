package com.technoelevate.javabasics.encapsulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTest {
	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root","admin");
			Statement createStatement= connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery("select * from employee");
			while(executeQuery.next()) {
				String string=executeQuery.getString(1);
				Integer i=executeQuery.getInt(2);
				System.out.println(string+" "+i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
