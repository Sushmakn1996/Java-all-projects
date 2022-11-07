package com.technoelevate.javabasics.collections;

public class MyThreadTest {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 15; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i + " "+Thread.currentThread().getId());
			}
		};
		Runnable runnable2 = () -> {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(ch +" " +Thread.currentThread().getName());
			}
		};
		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(runnable2);
		thread.start();
		thread2.start();
	}
}
