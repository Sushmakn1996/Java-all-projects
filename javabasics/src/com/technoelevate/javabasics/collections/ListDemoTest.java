package com.technoelevate.javabasics.collections;

import java.util.Iterator;

public class ListDemoTest {
	public static void main(String[] args) {
		ListDemo demo = new ListDemo(5);
		demo.add(10);
		demo.add(20);
		demo.add(30);
		demo.add(40);
		System.out.println(demo);
		Iterator iterator=demo.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
