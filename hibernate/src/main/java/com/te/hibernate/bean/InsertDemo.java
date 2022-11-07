package com.te.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {
public static void main(String[] args) {
	Employee employee=new Employee();
//	employee.setEmpId(6);
	employee.setEmpName("bindukumar");
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
//	entityManager.persist(employee);
	Employee employee2=entityManager.find(Employee.class, 10);
//	System.out.println(employee2.getEmpId()+" "+employee2.getEmpName());
//	entityManager.remove(employee2);
//	employee2.setEmpName("SushmaKN");
	employee2.setEmpId(6);
	
	entityTransaction.commit();
}
}
