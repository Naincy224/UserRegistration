package com.bridgeit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ValidEmail {

	private String email;
	public static RegexPattern regexPattern;
	public static UserRegistration userRegistration;

	public ValidEmail() {
		super();
		this.email = email;

	}

	@Before
	public static void init() {
		regexPattern = new RegexPattern();
		userRegistration = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" });

	}
	
	  @Test public void validEmailSampleTest() { userRegistration.setEmail(email);
	  assertEquals(true, regexPattern.addEmailId());
	  
	  }
	  
	 
}
