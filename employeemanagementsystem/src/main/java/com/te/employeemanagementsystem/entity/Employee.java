package com.te.employeemanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="emp_primary_info")
public class Employee {

	@Id
	@Column(name="emp_id")
	private String empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_password")
	private String empPassword;
	
}
