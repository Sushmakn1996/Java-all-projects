package com.te.EmployeeDetails.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class EmployeePrimaryInfo implements Serializable {
	@Id
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	private String employeeDesignation;
	private String employeeBloodGroup;
	private String employeeEmailId;
	private String employeeDOB;
	private String employeeMaritalStatus;
	private String employeeGender;
	private int employeeDeptNo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeAddressInfo> addressInfo;

}
