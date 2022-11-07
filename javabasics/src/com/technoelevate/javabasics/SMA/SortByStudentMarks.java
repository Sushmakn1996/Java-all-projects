package com.technoelevate.javabasics.SMA;

import java.util.Comparator;

public class SortByStudentMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSMarks()-o2.getSMarks();
	}

}
