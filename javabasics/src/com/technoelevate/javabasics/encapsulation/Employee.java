package com.technoelevate.javabasics.encapsulation;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int Id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}
