package com.te.springcoreannotation.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Employee {

//	@Value("189")
	private int empId;
//	@Value("Sushma")
	private String empName;
	@Autowired
	private Address address;

}
