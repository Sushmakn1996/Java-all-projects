package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.pojo.Address;
import com.te.springcoreannotation.pojo.Employee;

@Configuration
@ComponentScan(basePackages = "com.te.springcoreannotation")
public class EmployeeAddressConfig {
	
	@Bean
	public Employee employee1() {
		Employee employee=new Employee();
		employee.setEmpId(10);
		employee.setEmpName("Priya");
		return employee;
	}
	@Bean
	@Primary
	public Employee employee2() {
		Employee employee=new Employee();
		employee.setEmpId(20);
		employee.setEmpName("Sushma");
		return employee;
	}
	@Bean
	@Primary
	public Address address1() {
		Address address=new Address();
		address.setStreet("JP Nagar");
		address.setCity("Bengaluru");
		address.setState("Karnataka");	
		return address;
	}
	@Bean
	public Address address2() {
		Address address=new Address();
		address.setStreet("Jaynagar");
		address.setCity("Bengaluru");
		address.setState("Karnataka");	
		return address;
	}
	

}
