package com.te.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.employeemanagementsystem.entity.Employee;
import com.te.employeemanagementsystem.service.EmployeeService;

import sun.print.resources.serviceui;

@Controller
public class EmployeeController {
	
	@Autowired
	public EmployeeService service;

	@GetMapping("/register")
	public String getRegistrationForm() {
		return "homepage";

	}

	@GetMapping("/login")
	public String getloginForm() {
		return "login";

	}
	
	@PostMapping("/register")
	public String register(Employee employee ,ModelMap map) {
		if(employee!=null) {
			if(service.register(employee)) {
				map.addAttribute("msg", "Registration Successful");
			} else {
				map.addAttribute("errmsg", "Something went wrong");
			}
		}
		return "homepage";
	}
	
	public String authenticate(Employee employee,ModelMap map) {
		if(employee!=null && (!employee.getEmpId().isEmpty() || !employee.getEmpPassword().isEmpty())) {
			Employee employee2 = service.authenticate(employee);
			if (employee2 != null) {
				map.addAttribute("name", employee2.getEmpName());
				return "welcome";
			} else {
				map.addAttribute("errMsg", "Invalid credentials");
			}
		} else {
			map.addAttribute("errMsg", "Please enter something!");
		}
		return "login";
	}

}
