package com.bridgeit;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class RegexPattern {

	UserRegistration userRegistration = new UserRegistration();

	public boolean addFirstName() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter first name:");
		String name = sc1.nextLine();
		userRegistration.setName1(name);
		
		Predicate<String> fName = (firstName)->{
			
			return firstName.matches("^([A-Z]{1}+[a-z]{2,})$");
		};
		
		boolean check = fName.test(userRegistration.getName1());

		if (check == true) {
		} else {
			System.out.println("invalid first name add a valid name");
			addFirstName();
		}
		return check;
	}

	public boolean addLastName() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter last name:");
		String name = sc2.nextLine();
		userRegistration.setName2(name);
		
		Predicate<String> lName = (lastName)->{
			return lastName.matches("^([A-Z]{1}+[a-z]{2,})$");
		};
		boolean check=lName.test(userRegistration.getName2()) ;  
		
		if (check == true) {
		} else {
			System.out.println("invalid last name add a valid name");
			addLastName();
		}
		return check;
	}

	public boolean addEmail() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter a email id:");
		String email = sc3.nextLine();
		userRegistration.setEmail(email);
		
		Predicate<String> isValidEmail = (e_mail)->{
		return e_mail.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{1,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");	
		};
		boolean check = isValidEmail.test(userRegistration.getEmail());
		
		if (check == true) {
		} else {
			System.out.println("invalid email id add a valid email id");
			addEmail();
		}
		return check;
	}

	public boolean addMobile() {
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter a valid mobile no:");
		String mobile = sc4.nextLine();
		userRegistration.setMobile(mobile);
		
		Predicate<String> mobile_no = (mobileNo)-> {
		return mobileNo.matches("^([0-9]{1,2})\\s[0-9]{10}$");	
		};
		boolean check = mobile_no.test(userRegistration.getMobile());
		
		if (check == true) {

		} else {
			System.out.println(" Invalid mobile no. add a valid no.");
			addMobile();
		}
		return check;
	}

	public boolean addPassword() {
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String password = sc5.nextLine();
		userRegistration.setPassword(password);
		
		Predicate<String> p_assword = (pass_word)->{
		return pass_word.matches("^(?=.*[A-Z a-z])(?=.*[0-9])(?=.*[@|#|$|%|^|&|-|+|=|(|)|]).{8,}$");	
		};
		boolean check = p_assword.test(userRegistration.getPassword());
		if (check == true) {
		} else {
			System.out.println("Invalid password format add atleast 8 character having a upper case");
			addPassword();
		}
		return check;
	}
		public boolean addEmailId() {
			
			Predicate<String> getEmaiz = (getEmail)->{
				return Pattern.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{1,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$", getEmail);	
				};
			
			return getEmaiz.test(userRegistration.getEmail());
		}
	
}


	
	

