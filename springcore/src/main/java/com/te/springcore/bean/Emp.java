package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Emp implements Serializable {
	private int empId;
	private String empName;
	private EmpAdd empadd1;
	
	
	public Emp(int empId, String empName, EmpAdd empadd1) {
		this.empId = empId;
		this.empName = empName;
		this.empadd1 = empadd1;
	}
	
	

	
	

}
