package com.bridgelabz.regexProblems.test;

import com.bridgelabz.regexProblems.regexUserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailListTest {
    String testEmail;

    public EmailListTest(String testEmail) {
        super();
        this.testEmail = testEmail;
    }

    @Parameterized.Parameters
    public static List<String> data() {
        return Arrays.asList( "abc@yahoo.com" ,"abc-100@yahoo.com" ,"abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
                "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "a.b1.00@abc.net", "abc", "abc@.com.my",
                "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"
        );
    }

    @Test
    public void testEmailList(){
        Assertions.assertFalse(regexUserRegistration.validatePattern(testEmail,regexUserRegistration.emailRegExpPattern));
    }
}
