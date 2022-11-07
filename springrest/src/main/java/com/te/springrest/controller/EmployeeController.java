package com.te.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrest.dto.EmployeeResponse;
import com.te.springrest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@DeleteMapping("/delete/{empId}")
	public EmployeeResponse deleteEmployee(@PathVariable String empId) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.deleteEmployee(empId)) {
			response.setMsg("Success");
			response.setStatusCode("200");
			response.setDesc("Employee Deleted!");
		} else {
			response.setMsg("Failure");
			response.setStatusCode("400");
			response.setDesc("Employee Not Found!!");
		}
		return response;
	}
	
	public void createEmployee() {
		
	}
}
