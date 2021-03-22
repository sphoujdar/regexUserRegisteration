package com.bridgelabz.regexProblems.test;

import com.bridgelabz.regexProblems.RegexUserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class regexUserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String firstName = "Shubham";
        Assert.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String firstName = "Sh";
        Assert.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String firstName = "Phoujdar";
        Assert.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.lastNameRegExpPattern));
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String firstName = "ph";
        Assert.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.lastNameRegExpPattern));
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String firstName = "a.b1.00@abc.net";
        Assert.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.emailRegExpPattern));
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String firstName = "abc";
        Assert.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.emailRegExpPattern));
    }
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String firstName = "91 9822056132";
        Assert.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.mobileNumberRegExpPattern));
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String firstName = "+919822056132";
        Assert.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.mobileNumberRegExpPattern));
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String firstName = "asdU2@q4515";
        Assert.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.passwordRegExpPattern));
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String firstName = "adwssdfrgsadw";
        Assert.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.passwordRegExpPattern));
    }



}


