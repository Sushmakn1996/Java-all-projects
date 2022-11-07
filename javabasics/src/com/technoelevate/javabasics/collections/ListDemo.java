package com.technoelevate.javabasics.collections;

import java.util.Iterator;

public class ListDemo implements Iterable {

	private Object[] array;
	private int position;
	private Object[] temp;

	public ListDemo(int arraysize) {
		this.array = new Object[arraysize];
	}

	public void add(Object element) {
		if (position >= array.length) {
			grow();
		}
		array[this.position++] = element;
	}

	public Object get(int index) {
		return array[index];
	}

	public int size() {
		return this.position;
	}

	private void grow() {
		Object[] temp = new Object[array.length + 5];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}

	@Override
	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		String string = "[" + array[0];
		for (int i = 1; i < size(); i++) {
			string += "," + array[i];
		}
		string += "]";
		return string;
	}

	@Override
	public Iterator iterator() {
		return new MyItr();
	}
	
	private class MyItr implements Iterator{
		private int index = 0;
		@Override
		public boolean hasNext() {
			
			return (index<position)?true:false;
		}

		@Override
		public Object next() {
			return array[index++];
		}
		
	}
	
}
