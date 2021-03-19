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
        String firstNameString;
        firstNameString = getUserInput(scanner, "Please Enter Valid First Name:");

        if(validatePattern(firstNameString, firstNameRegExpPattern)){
            System.out.println("First Name String is Valid.");
        }else
            System.out.println("First Name String is invalid.");


    }




}
