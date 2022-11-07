package com.technoelevate.javabasics.encapsulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Movies {
	private String name;
	private String duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public static void insertDetails(String name, String duration) throws SQLException {
		String str="insert into movies values(?,?)";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "admin");
		PreparedStatement stmt = con.prepareStatement(str);
		stmt.setString(1, name);
		stmt.setString(2, duration);
		stmt.executeUpdate();
		System.out.println("Successfully inserted the record");
		con.close();
	}

	public static void deleteDetails(String name) throws SQLException {
		String strdelete="delete from movies where name=?";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "admin");
		PreparedStatement stmt = con.prepareStatement(strdelete);
		stmt.setString(1, name);
		int del=stmt.executeUpdate();
		System.out.println(del+" entered data is removed successfully");
		con.close();
	}

	public static void updateDetails(String duration, String name) throws SQLException {
		String strupdate="update movies set duration=? where name=?";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "admin");
		PreparedStatement stmt = con.prepareStatement(strupdate);
		stmt.setString(2, duration);
		stmt.setString(1, name);
		int up=stmt.executeUpdate();
		System.out.println(up+" entered data is updated successfully");
		con.close();
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		//Inserting the data
		while(true) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the movie name and duration to be inserted:");
		String st=sc.next();
		String st2=sc.next();
		insertDetails(st,st2);
		System.out.println("If you want to insert more press yes");
		String stg=sc.next();
		if(stg.equalsIgnoreCase("yes")) {
			continue;
		} else {
			break;
		}
		}

		//Deleting the data
//		while(true) {
//			Scanner sc =new Scanner(System.in);
//			System.out.println("Enter the movie name to be deleted:");
//			String st3=sc.next();
//			deleteDetails(st3);
//			System.out.println("If you want to delete more press yes");
//			String stg=sc.next();
//			if(stg.equalsIgnoreCase("yes")) {
//				continue;
//			} else {
//				break;
//			}
//			}
//		}
		
		
		//Updating the data
//		System.out.println("Enter the movie name to be updated:");
//		String st4=sc.next();
//		String st5=sc.next();
//		updateDetails(st4, st5);
		
		
		
	}		

}
