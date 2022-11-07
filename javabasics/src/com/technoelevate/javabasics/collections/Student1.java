package com.technoelevate.javabasics.collections;

public class Student1 {
	private int SID;
	private String SName;
	private int SAge;
	private int SMarks;
	
	public int getSID() {
		return SID;
	}

	public String getSName() {
		return SName;
	}

	public int getSAge() {
		return SAge;
	}

	public int getSMarks() {
		return SMarks;
	}

	public Student1(int id,String name,int age,int marks) {
		this.SID=id;
		this.SName=name;
		this.SAge=age;
		this.SMarks=marks;
	}

	@Override
	public String toString() {
		return "Student1 [SID=" + SID + ", SName=" + SName + ", SAge=" + SAge + ", SMarks=" + SMarks + "]";
	}

	
}
