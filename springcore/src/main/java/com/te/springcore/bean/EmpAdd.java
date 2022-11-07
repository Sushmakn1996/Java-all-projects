package com.te.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EmpAdd implements Serializable {
	private String empStreet;
	private String empCity;
	private String empState;

	
	
	

}
