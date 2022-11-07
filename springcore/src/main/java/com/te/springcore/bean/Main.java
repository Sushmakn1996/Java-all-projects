package com.te.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("New.xml");
//		employee is dependent on address
		Emp emp = (Emp) context.getBean("emp");
		System.out.println(emp);
//		Using constructor
//		EmpAdd empadd = (EmpAdd) context.getBean("empadd1");
//		System.out.println(empadd);
//		EmpAdd empadd2 = (EmpAdd) context.getBean("empadd2");
//		System.out.println(empadd2);
	}
}
