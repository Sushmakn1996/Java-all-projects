package com.te.employeemanagementsystem.dao;

import com.te.employeemanagementsystem.entity.Employee;

public interface EmployeeDao {
	

	public boolean register(Employee employee);

	public Employee authenticate(Employee employee);

}
