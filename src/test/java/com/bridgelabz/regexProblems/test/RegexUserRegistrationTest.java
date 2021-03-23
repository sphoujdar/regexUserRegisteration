package com.bridgelabz.regexProblems.test;

import com.bridgelabz.regexProblems.RegexUserRegistration;
import com.bridgelabz.regexProblemsExceptions.RegexUserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

public class RegexUserRegistrationTest {
    @Test
    public void givenString_WhenNull_ShouldReturnFalse(){
        String testString = null;
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenString_WhenEmpty_ShouldReturnFalse(){
        String testString = "";
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String testString = "Shubham";
        try {
            Assert.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String testString = "Sh";
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String testString = "Phoujdar";
        try {
            Assert.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.lastNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String testString = "ph";
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.lastNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String testString = "a.b1.00@abc.net";
        try {
            Assert.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.emailRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String testString = "abc";
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.emailRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String testString = "91 9822056132";
        try {
            Assert.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.mobileNumberRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String testString = "+919822056132";
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.mobileNumberRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String testString = "asdU2@q4515";
        try {
            Assert.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.passwordRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String testString = "adwssdfrgsadw";
        try {
            Assert.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.passwordRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    

}


