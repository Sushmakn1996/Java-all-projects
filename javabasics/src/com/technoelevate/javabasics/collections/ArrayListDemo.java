package com.technoelevate.javabasics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListDemo {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList(5);
	arrayList.add(2);
	arrayList.add(2.5);
	arrayList.add("Sushma");
	arrayList.add(20.50);
	
	arrayList.forEach(ar->System.out.println(ar));
	System.out.println("--------------------");
	
	
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
		}
	System.out.println("--------------------");
	
	for(Object obj:arrayList) {
		System.out.println(obj);
		}
	System.out.println("--------------------");
	
	ListIterator listIterator=arrayList.listIterator(); 
	while(listIterator.hasNext()){
		System.out.println(listIterator.next());
		}
	System.out.println("--------------------");
	
	while(listIterator.hasPrevious()){
		System.out.println(""+listIterator.previous());
		}
	System.out.println("--------------------");
//	Collections.reverse(arrayList);
	
//		Synchronized arraylist
	
	try {
		List arr= Collections.synchronizedList(arrayList);
	} catch (Throwable e) {
		System.out.println();
		e.printStackTrace();
	}
	
	
	
	}
}
