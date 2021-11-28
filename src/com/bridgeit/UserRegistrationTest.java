package com.bridgeit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

	public static RegexPattern regexPattern;
	public static UserRegistration userResistration;
	
    @BeforeClass
    public static void init() {
    	regexPattern = new RegexPattern();
    	userResistration = new UserRegistration();
    }
 
    @Test
    public void validFirstNameTest() {
    	boolean result = regexPattern.addFirstName();
    	assertEquals(true, result);
    }
    
    @Test
    public void validLastNameTest() {
    	boolean result = regexPattern.addLastName();
    	assertEquals(true, result);
    }
    @Test
    public void validEmailTest() {
    	boolean result = regexPattern.addEmail();
    	assertEquals(true, result);
    }
    @Test
    public void validMobileTest() {
    	boolean result = regexPattern.addMobile();
    	assertEquals(true, result);
    }
    @Test
    public void validPasswordTest() {
    	boolean result = regexPattern.addPassword();
    	assertEquals(true, result);
    }
    @Test
    public void invalidFirstNameTest() {
    	boolean result = regexPattern.addFirstName();
    	assertEquals(false, result);
    }
    @Test
    public void invalidLastNameTest() {
    	boolean result = regexPattern.addLastName();
    	assertEquals(false, result);
    }
    @Test
    public void invalidEmailTest() {
    	boolean result = regexPattern.addEmail();
    	assertEquals(false, result);
    }
    @Test
    public void invalidMobileTest() {
    	boolean result = regexPattern.addMobile();
    	assertEquals(false, result);
    }
    @Test
    public void invalidPasswordTest() {
    	boolean result = regexPattern.addPassword();
    	assertEquals(false, result);
    }
}
