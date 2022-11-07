package com.te.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.employeemanagementsystem.dao.EmployeeDao;
import com.te.employeemanagementsystem.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeDao dao;

	@Override
	public boolean register(Employee employee) {
		if(employee.getEmpId().startsWith("TYSS")) {
			return dao.register(employee);
		}
		return false;
	}

	@Override
	public Employee authenticate(Employee employee) {
		if (employee.getEmpId().startsWith("TYSS")) {
			return dao.authenticate(employee);

		}
		return null;
	}
	

}
