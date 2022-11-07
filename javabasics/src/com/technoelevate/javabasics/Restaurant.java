package com.technoelevate.javabasics;

import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		String menu[]= {" ","1.Idli","2.Dosa","3.Poori","4.Pulav","5.Biryani","6.Pizza","7.Burger"};
		int price[]= {0,40,40,30,50,150,100,80};
		
		for(int i=1;i<menu.length;i++)
		{
			System.out.println(menu[i]+"  "+price[i]);
		}
		
		int total=00;
		System.out.println("Enter the number of items you want to order:");
		int n= scanner.nextInt();
		int[] prices=new int[n];
		String[] menus=new String[n];
		System.out.println("Enter the item number:");
		
//		if(item>=7) {
//			System.out.println("Selected item is not available...!!!");
//		}else {
//			System.out.println("Please select the specified number in the menu:");
//		}
		
		
		for(int i=0;i<n;i++) {
			int item=scanner.nextInt();
			total=total+price[item];
			prices[i]=price[item];
			menus[i]=menu[item];
		}
		scanner.close();

		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i]+ "  "+prices[i]);
		}
		System.out.println("Total amt is: "+total);
		System.out.println("Order is placed");
				
}
}

