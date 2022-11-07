package com.technoelevate.javabasics.checkedexception;

public class Voting {
	int age;
	
	public Voting(int age) {
		this.age=age;
	}
	
	public void vote(int age) throws Exception {
		if(age>=this.age) {
			System.out.println("You can vote");
		}else {
			System.out.println("You cannot vote");
		}
	}

}
