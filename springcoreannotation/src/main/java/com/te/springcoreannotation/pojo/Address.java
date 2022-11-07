package com.te.springcoreannotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Address {
	
//	@Value("JP Nagar")
	private String street;
//	@Value("Bengaluru")
	private String city;
//	@Value("Karnataka")
	private String state;
	

}
