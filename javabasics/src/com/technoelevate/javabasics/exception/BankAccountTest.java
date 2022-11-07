package com.technoelevate.javabasics.exception;

import java.util.Scanner;

public class BankAccountTest {
public static void main(String[] args) throws Throwable {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the withdraw amount:");
	BankAccount bankAccount=new BankAccount(10000.00);
	int n=scanner.nextInt();
	try {
		bankAccount.withdraw(n);
	} catch (InSufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
	}
}
