package com.bridgeit;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to User registration program ");

		//UC1
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first name:");
		String name1 = sc.next();
		System.out.println(Name (name1));
		
		//UC2
		System.out.println("Enter last name:");
		String name2 = sc.next();
		System.out.println(Name (name2));
		
		//UC3
		System.out.println("Enter Email Address : ");
		String email = sc.next();
		System.out.println(Email(email));
	}
private static boolean Name(String name) {
	
	return name.matches("^([A-Z]{1}+[a-z]{3,})*$");
	}
private static boolean Email(String email) {
	return email.matches("^([A-Za-z]{3,})[0-9a-zA-Z]+(@)+[0-9a-z]+(.)+[a-z]{2,}$");
	
}
}
