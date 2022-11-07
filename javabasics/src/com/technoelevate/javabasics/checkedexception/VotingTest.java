package com.technoelevate.javabasics.checkedexception;

import java.util.Scanner;

public class VotingTest {
	
	private String msg;
	public String getMessage() {
		return this.msg;
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your age:");
	Voting voting=new Voting(18);
	int n=scanner.nextInt();
	try {
		voting.vote(n);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
