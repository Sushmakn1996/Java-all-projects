package com.technoelevate.javabasics.exception;

public class BankAccount {
	double balance;
	
	BankAccount(double balance){
		this.balance=balance;
	}
	
	public void withdraw(double amount) throws Throwable {
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Withdraw the amount "+amount);
			System.out.println("Balance is "+this.balance);
		}
		else {	
			throw new InSufficientBalanceException("Insufficient Balance");
			 }
	}
}
