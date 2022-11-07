package com.technoelevate.javabasics.collections;

import java.util.Comparator;

public class SortByCity implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().length()-o2.getCity().length();
	}

}
