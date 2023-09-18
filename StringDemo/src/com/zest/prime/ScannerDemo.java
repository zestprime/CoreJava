package com.zest.prime;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//1
		
		System.out.println("Please enter input");
		//Reading Data
		//String input = sc.next();
		System.out.println("Please enter Name:");
		String name = sc.nextLine();
		
		System.out.println("Name is:"+name);
		
		System.out.println("Please enter City:");
		String city = sc.nextLine();
		System.out.println("City is:"+city);
		System.out.println("Please enter Age:");
		int age = sc.nextInt();
		System.out.println("Age:"+age);
	}

}
