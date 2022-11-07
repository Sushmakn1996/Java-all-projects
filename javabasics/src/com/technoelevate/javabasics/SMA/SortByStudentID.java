package com.technoelevate.javabasics.SMA;

import java.util.Comparator;

public class SortByStudentID implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSID()-o2.getSID();
	}

	

}
