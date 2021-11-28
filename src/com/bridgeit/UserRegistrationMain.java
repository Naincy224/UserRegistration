package com.bridgeit;

public class UserRegistrationMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to User registration program ");

		RegexPattern regexPattern = new RegexPattern();
		regexPattern.addFirstName();
		regexPattern.addLastName();
		regexPattern.addEmail();
		regexPattern.addMobile();
		regexPattern.addPassword();
		
	}
}