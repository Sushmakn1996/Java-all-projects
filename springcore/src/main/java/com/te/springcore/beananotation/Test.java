package com.te.springcore.beananotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("newxml.xml");
//		Car car = context.getBean(Car.class);
		Car car = context.getBean("car2", Car.class);
		System.out.println(car);

	}
}
