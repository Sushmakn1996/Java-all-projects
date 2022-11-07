package com.technoelevate.javabasics.collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
public static void main(String[] args) {
	Student student = new Student(12, "Sam", "Banglore");
	Student student1 = new Student(22, "Manoj", "Shimla");
	Student student2 = new Student(8, "Akash", "Pune");

	ArrayList<Student> al = new ArrayList();
	al.add(student);
	al.add(student1);
	al.add(student2);
	
	System.out.println("-----before sorting-----");
	for (Student student3 : al) {
		System.out.println(student3);
	}
	
	System.out.println("-----after sorting Camparable-----");
	Collections.sort(al);
	for (Student student3 : al) {
		System.out.println(student3);	
	}
	
	System.out.println("-----after sorting Comparator by ID-----");
	Collections.sort(al, new SortByRollNo());
	for (Student student3 : al) {
		System.out.println(student3);	
	}
	
	System.out.println("-----after sorting Comparator by Name-----");
	Collections.sort(al,new SortByName());
	for (Student student3 : al) {
		System.out.println(student3);	
	}
	
	System.out.println("-----after sorting Comparator by City-----");
	Collections.sort(al,new SortByCity());
	for (Student student3 : al) {
		System.out.println(student3);	
	}
	
}
}
