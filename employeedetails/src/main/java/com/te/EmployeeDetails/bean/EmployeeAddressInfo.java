package com.te.EmployeeDetails.bean;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class EmployeeAddressInfo implements Serializable {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int addressId;
	private String addressType;
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private int pinCode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
	
	
	
	
	
	
	

}
