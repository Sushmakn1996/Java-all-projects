package com.technoelevate.javabasics.collections;

public class Student implements Comparable<Student> {

	 private int rollNo;
	 private String name;
	 private String city;

	public Student(int rollNo, String name, String city) {
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	
	public int getRollNo() {
		return rollNo;
	}


	public String getName() {
		return name;
	}


	public String getCity() {
		return city;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.rollNo - s.rollNo;
	}

}
