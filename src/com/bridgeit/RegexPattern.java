package com.bridgeit;

import java.util.Scanner;

public class RegexPattern {

	private String name1;
	private String name2;
	private String email;

	Scanner sc = new Scanner(System.in);

	public void addFirstName() {

		System.out.println("Enter first name:");
		name1 = sc.next();
		boolean check = name1.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
		} else {
			System.out.println("invalid first name add a valid name");
			addFirstName();
		}
	}

	public void addLastName() {

		System.out.println("Enter last name:");
		name2 = sc.next();
		boolean check = name2.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
		} else {
			System.out.println("invalid last name add a valid name");
			addLastName();
		}
	}

	public void addEmail() {

		System.out.println("Enter a email id:");
		email = sc.next();
		boolean check = email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");
		if (check == true) {
		} else {
			System.out.println("invalid email id add a valid email id");
			addEmail();
		}
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

}