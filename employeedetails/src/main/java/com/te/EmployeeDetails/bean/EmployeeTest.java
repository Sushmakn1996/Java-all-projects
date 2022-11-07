package com.te.EmployeeDetails.bean;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeTest {
	public static void main(String[] args) {
		
		EmployeePrimaryInfo employeePrimaryInfo=new EmployeePrimaryInfo();
		employeePrimaryInfo.setEmployeeId(210);
		employeePrimaryInfo.setEmployeeName("Sush");
		employeePrimaryInfo.setEmployeeAge(25);
		employeePrimaryInfo.setEmployeeDesignation("Trainee");
		employeePrimaryInfo.setEmployeeBloodGroup("A+");
		employeePrimaryInfo.setEmployeeEmailId("sush@gmail.com");
		employeePrimaryInfo.setEmployeeDOB("17/05/2000");
		employeePrimaryInfo.setEmployeeMaritalStatus("single");
		employeePrimaryInfo.setEmployeeGender("female");
		employeePrimaryInfo.setEmployeeDeptNo(10);
		
		EmployeeAddressInfo permanentaddressInfo=new EmployeeAddressInfo();
		permanentaddressInfo.setAddressType("Permanent");
		permanentaddressInfo.setHouseNo("17");
		permanentaddressInfo.setStreet("Jp Nagar 7th phase");
		permanentaddressInfo.setCity("Bengaluru");
		permanentaddressInfo.setState("Karnataka");
		permanentaddressInfo.setCountry("India");
		permanentaddressInfo.setPinCode(560078);
		permanentaddressInfo.setEmployeePrimaryInfo(employeePrimaryInfo);
		
		EmployeeAddressInfo temporaryaddressInfo=new EmployeeAddressInfo();
		temporaryaddressInfo.setAddressType("Temporary");
		temporaryaddressInfo.setHouseNo("17");
		temporaryaddressInfo.setStreet("Jp Nagar 7th phase");
		temporaryaddressInfo.setCity("Bengaluru");
		temporaryaddressInfo.setState("Karnataka");
		temporaryaddressInfo.setCountry("India");
		temporaryaddressInfo.setPinCode(560078);
		temporaryaddressInfo.setEmployeePrimaryInfo(employeePrimaryInfo);
		
		ArrayList<EmployeeAddressInfo> infos=new ArrayList<EmployeeAddressInfo>();
		infos.add(permanentaddressInfo);
		infos.add(temporaryaddressInfo);
		employeePrimaryInfo.setAddressInfo(infos);
		

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
			try {
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
				entityManager=entityManagerFactory.createEntityManager();
				entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.persist(employeePrimaryInfo);
				entityTransaction.commit();
			} catch (Exception e) {
				if(entityTransaction!=null) {
				entityTransaction.rollback();
				e.printStackTrace();
				}
			}finally {
				if(entityManager!=null) {
				entityManager.close();
			}	
	}
	}
}
