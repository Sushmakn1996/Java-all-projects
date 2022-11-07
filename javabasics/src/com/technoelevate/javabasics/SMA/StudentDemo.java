package com.technoelevate.javabasics.SMA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.technoelevate.javabasics.collections.SortByRollNo;

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10, "Abhi", 22, 80));
		al.add(new Student(30, "Suhas", 23, 60));
		al.add(new Student(40, "Chethan", 24, 90));
		al.add(new Student(20, "Darshan", 25, 50));
		al.add(new Student(50, "Bharath", 26, 70));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for sorting by ID");
		System.out.println("Enter 2 for sorting by Name");
		System.out.println("Enter 3 for sorting by Marks");
		System.out.println("Enter 4 for sorting by Age");
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("-----Sorted by Comparator by ID-----");
			Collections.sort(al, new SortByStudentID());
			for (Student student : al) {
				System.out.println(student);
			}
		} else if (n == 2) {
			System.out.println("-----Sorted by Comparator by Name-----");
			Collections.sort(al, new SortByStudentName());
			for (Student student : al) {
				System.out.println(student);
			}
		} else if (n == 3) {
			System.out.println("-----Sorted by Comparator by Age-----");
			Collections.sort(al, new SortByStudentAge());
			for (Student student : al) {
				System.out.println(student);
			}
		}else if (n == 4) {
			System.out.println("-----Sorted by Comparator by Marks-----");
			Collections.sort(al, new SortByStudentMarks());
			for (Student student : al) {
				System.out.println(student);
			}
		} 
		else {
			System.out.println("Entered number is wrong");
		}
		
	}
}
