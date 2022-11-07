package com.technoelevate.javabasics.SMA;

import java.util.Comparator;

public class SortByStudentName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSName().compareTo(o2.getSName());
	}

}
