package com.technoelevate.javabasics.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println(hm.put(100, "aegfjbc"));
		System.out.println(hm.put(200, "aegfjbc"));
		System.out.println(hm.put(300, "aegfjbc"));
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());

		
		Set<Entry<Integer,String>> e=hm.entrySet();
		for (Entry<Integer, String> entry : e) {
			System.out.println(entry.getKey());
		}

		Set<Entry<Integer,String>> e1=hm.entrySet();
		for (Entry<Integer, String> entry : e1) {
			System.out.println(entry.getValue());
		}

		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			if (entry.getKey() == 200) {
				entry.setValue("Suhas");
			}
			System.out.println(entry);
		}
		
		Set<Entry<Integer,String>> e2=hm.entrySet();
		for (Entry<Integer, String> entry : e2) {
			System.out.println(entry.getValue());
		}

	}
}
