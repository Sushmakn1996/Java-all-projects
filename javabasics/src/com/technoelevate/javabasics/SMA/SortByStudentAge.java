package com.technoelevate.javabasics.SMA;

import java.util.Comparator;

public class SortByStudentAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSAge()-o2.getSAge();
	}

	

}
