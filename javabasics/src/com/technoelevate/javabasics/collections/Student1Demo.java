package com.technoelevate.javabasics.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.technoelevate.javabasics.SMA.Student;

public class Student1Demo {
	public static void main(String[] args) {
		Student1 s1 = new Student1(20, "abcde", 20, 50);
		Student1 s2 = new Student1(10, "abce", 22, 60);
		Student1 s3 = new Student1(30, "abe", 23, 70);
		Student1 s4 = new Student1(40, "ae", 24, 80);
		Student1 s5 = new Student1(50, "abcdef", 25, 90);

		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Predicate<Student1> predicate = (Student) -> Student.getSName().length() >= 4;
		al.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::println);

	}
}
//Student1[] sl = { s1, s2, s3, s4, s5 };
//for (Student1 s : sl) {
//	if (s.SName.length() >= 4) {
//		System.out.println(s);
//	}
//}