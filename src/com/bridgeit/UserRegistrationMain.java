package com.bridgeit;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to User registration program ");

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first name:");
		String name1 = sc.next();
		System.out.println(Name (name1));
		
	}
private static boolean Name(String name) {
	
	return name.matches("^([A-Z]{1}+[a-z]{3,})*$");
}
}
