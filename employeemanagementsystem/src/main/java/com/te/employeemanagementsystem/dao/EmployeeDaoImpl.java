package com.te.employeemanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.te.employeemanagementsystem.entity.Employee;
import com.te.employeemanagementsystem.service.EmployeeService;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	public EmployeeService service;
	
	
	@Override
	public boolean register(Employee employee) {
		boolean isRegistered = false;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
			EntityManager manager=entityManagerFactory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			isRegistered = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isRegistered;
	}


	@Override
	public Employee authenticate(Employee employee) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		Employee employee2 = manager.find(Employee.class, employee.getEmpId());
		if(employee2!=null) {
			if(employee.getEmpPassword().equals(employee2.getEmpPassword())) {
				return employee2;
			}
		}
		return null;
	}

}
