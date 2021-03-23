/*
https://www.ocpsoft.org/tutorials/regular-expressions/password-regular-expression/ - for Positive lookahead eg
https://stackoverflow.com/questions/10804732/difference-between-and - various uses of "?=" and similar "?" ops
http://www.regular-expressions.info/ - large resource
https://www3.ntu.edu.sg/home/ehchua/programming/howto/Regexe.html
https://stackoverflow.com/questions/47545450/regex-match-any-single-character-one-character-only - generic explanation for single char match
https://stackoverflow.com/questions/35060182/regex-only-one-special-char - for a specific eg of only 1 sp char in pwd
*/
package com.bridgelabz.regexProblems;
import com.bridgelabz.regexProblemsExceptions.RegexUserRegistrationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {
    public static final String firstNameRegExpPattern = "^[A-Z][a-z]{2,}";
    public static final String lastNameRegExpPattern = "^[A-Z][a-z]{2,}";
    public static final String emailRegExpPattern = "^([A-Za-z0-9]+[.+-]?[A-Za-z0-9]+)+[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}[.]?[a-zA-Z]{0,3}";
    //"^[a-zA-Z0-9]+([.+,-,_]?[a-zA-Z0-9]+)?[@][a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$"
    public static final String mobileNumberRegExpPattern = "^[0-9]{2}[\\ ][0-9]{10}";
    public static final String passwordRegExpPattern = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

    public static boolean validatePattern(String argument, String regExp) throws RegexUserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(argument);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new RegexUserRegistrationException("Please enter valid input which is not null.");
        }
    }



    // All code from this point is not required for running test cases and validating code working.
    public static void testIfValidOutput(String regExpString, String[] testStrings, String printMessage){
        System.out.printf("\n--------------------------------%s--------------------------------\n",printMessage);
        for (String testString : testStrings) {
            try {
                if (validatePattern(testString, regExpString)) {
                    System.out.printf(" Valid  : %s\n", testString);
                } else
                    System.out.printf("Invalid : %s\n", testString);
            } catch (RegexUserRegistrationException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        String[] firstNameList= {"Shubham","Sh", "shubham", "Boo888", null, ""};
        testIfValidOutput(firstNameRegExpPattern, firstNameList, "First Name Validation");

        String[] lastNameList= {"Phoujdar", "Ph", "phoujdar", "Hoo"};
        testIfValidOutput(lastNameRegExpPattern, lastNameList, "Last Name Validation");

        String[] emailList= { null, "abc@yahoo.com" ,"abc-100@yahoo.com" ,"abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
                             "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "a.b1.00@abc.net", "abc", "abc@.com.my",
                             "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                             "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        testIfValidOutput(emailRegExpPattern, emailList, "Email Address Validation");

        String[] mobileNumberList= {"9822056132", "+919822056132", "91 9822056132", "+91 9822056132"};
        testIfValidOutput(mobileNumberRegExpPattern, mobileNumberList, "Mobile Number Validation");

        String[] passwordList= {"adwssdfrgsadw", "asdu2@q4515", "asd2@qU", "asdU2@q", "asdU2@qqq", "asdU2@@qqq", "asdU2@qq#"};
        testIfValidOutput(passwordRegExpPattern, passwordList, "Password String Validation");
    }


}


