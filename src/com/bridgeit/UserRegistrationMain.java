package com.bridgeit;

public class UserRegistrationMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to User registration program ");

		String name1;
		String name2;
		String email;
		String mobile;
		
		RegexPattern pattern = new RegexPattern();
		
		pattern.addFirstName();
		name1 = pattern.getName1();
		pattern.addLastName();
		name2 = pattern.getName2();
		pattern.addEmail();
		email = pattern.getEmail();
		pattern.addMobile();
		mobile = pattern.getMobile();
		
		System.out.println("First name : " + name1 + "  Last name :" + name2 +"  Email id :" + email + "Mobile no. :" + mobile);
	}
}