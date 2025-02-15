package Regex.BasicProblems.ValidateUsername;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static boolean isValidUsername(String str){
        String regex ="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();
        System.out.println(isValidUsername(str));
    }
}
