package com.te.EmployeeDetails.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class EmployeeSecondaryInfo implements Serializable {
	private String employeeAadharNo;
	private String employeePanNo;
	private String employeeDOJ;
	private String employeeIdentificationMark;
	private String FatherName;
	private String MotherName;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private

}
