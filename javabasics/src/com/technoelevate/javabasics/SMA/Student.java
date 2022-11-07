package com.technoelevate.javabasics.SMA;

public class Student implements Comparable<Student> {
	private int SID;
	private String SName;
	private int SAge;
	private int SMarks;

	public Student(int sID, String sName, int sAge, int sMarks) {
		this.SID = sID;
		this.SName = sName;
		this.SAge = sAge;
		this.SMarks = sMarks;
	}

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

	@Override
	public int compareTo(Student o) {
		return this.SID-o.SID;
	}

	@Override
	public String toString() {
		return "Student [SID=" + SID + ", SName=" + SName + ", SAge=" + SAge + ", SMarks=" + SMarks + "]";
	}

	

}
