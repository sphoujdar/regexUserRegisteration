import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUserRegistration {

    //Some Variables used throughout the program
    static Scanner scanner = new Scanner(System.in);



    public static String getUserInput(Scanner sc, String message){
        System.out.printf("%s\n",message);
        return sc.next();
    }

    public static boolean validatePattern(String argument, String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(argument);
        return matcher.matches();
    }


    public static void main(String[] args) {

        String firstNameRegExpPattern = "^[A-Z][a-z]{2,}";
        String firstNameString = getUserInput(scanner, "Please Enter Valid First Name:");
        if(validatePattern(firstNameString, firstNameRegExpPattern)){
            System.out.println("First Name String is Valid.");
        }else
            System.out.println("First Name String is invalid.");

        String lastNameRegExpPattern = "^[A-Z][a-z]{2,}";
        String lastNameString = getUserInput(scanner, "Please Enter Valid Last Name:");

        if(validatePattern(lastNameString, lastNameRegExpPattern)){
            System.out.println("Last Name String is Valid.");
        }else
            System.out.println("Last Name String is invalid.");


        String emailRegExpPattern = "^([A-Za-z0-9]+[\\.\\+-]?[A-Za-z0-9]+)+[\\@][a-zA-Z]+[\\.][a-zA-Z]{2,3}[\\.]?[a-zA-Z]{0,2}";
        String[] emailList= {"emailabc@yahoo.com" ,"abc-100@yahoo.com" ,"abc.100@yahoo.com", "abc111@abc.com",
                             "a.b1.00@abc.net", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                             "abc+100@gmail.com", "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                             "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                             "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};


        for (int i = 0; i< emailList.length; i++) {
            String emailString = emailList[i];
            if (validatePattern(emailString, emailRegExpPattern)) {
                System.out.printf("Valid : %s\n",emailList[i]);
            } else
                System.out.printf("Invalid : %s\n",emailList[i]);
        }



    }




}
