package com.bridgelabz.regexProblems.test;
import com.bridgelabz.regexProblems.regexUserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class regexUserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String firstName = "Shubham";
        Assertions.assertTrue(regexUserRegistration.validatePattern(firstName,regexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String firstName = "Sh";
        Assertions.assertFalse(regexUserRegistration.validatePattern(firstName,regexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String firstName = "Phoujdar";
        Assertions.assertTrue(regexUserRegistration.validatePattern(firstName,regexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String firstName = "ph";
        Assertions.assertFalse(regexUserRegistration.validatePattern(firstName,regexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String firstName = "a.b1.00@abc.net";
        Assertions.assertTrue(regexUserRegistration.validatePattern(firstName,regexUserRegistration.emailRegExpPattern));
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String firstName = "abc";
        Assertions.assertFalse(regexUserRegistration.validatePattern(firstName,regexUserRegistration.emailRegExpPattern));
    }
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String firstName = "91 9822056132";
        Assertions.assertTrue(regexUserRegistration.validatePattern(firstName,regexUserRegistration.mobileNumberRegExpPattern));
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String firstName = "+919822056132";
        Assertions.assertFalse(regexUserRegistration.validatePattern(firstName,regexUserRegistration.mobileNumberRegExpPattern));
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String firstName = "asdU2@q4515";
        Assertions.assertTrue(regexUserRegistration.validatePattern(firstName,regexUserRegistration.passwordRegExpPattern));
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String firstName = "adwssdfrgsadw";
        Assertions.assertFalse(regexUserRegistration.validatePattern(firstName,regexUserRegistration.passwordRegExpPattern));
    }
}
