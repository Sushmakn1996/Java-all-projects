package com.technoelevate.javabasics;

import java.util.Scanner;

public class Excersise {
		public static void main(String[] args) {
			String menu[]= {" ","1.Idli","2.Dosa","3.Poori","4.Pulav","5.Biryani","6.Pizza","7.Burger"};
			int price[]= {0,40,40,30,50,150,100,80};
			
			for(int i=1;i<menu.length;i++)
			{
				System.out.println(menu[i]+"  "+price[i]);
			}
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number of first item:");
			int input= scanner.nextInt();
			
			System.out.println("Enter the number of second item");
			int input1= scanner.nextInt();
			scanner.close();

			int total=0;
			total=total+price[input];
			total+=price[input1];
			System.out.println("Total amt is "+total);
			System.out.println("Order is placed");
		}	
	}
