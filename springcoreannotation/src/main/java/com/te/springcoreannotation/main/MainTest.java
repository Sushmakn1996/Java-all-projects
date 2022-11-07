package com.te.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.te.springcoreannotation.config.EmployeeAddressConfig;
import com.te.springcoreannotation.pojo.Employee;


public class MainTest {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeAddressConfig.class);
	Employee employee = context.getBean(Employee.class);
	System.out.println(employee);
	
//	Address address = context.getBean(Address.class);
//	System.out.println(address);
	
	
}
}
