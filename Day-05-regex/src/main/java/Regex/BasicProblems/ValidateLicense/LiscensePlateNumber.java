package Regex.BasicProblems.ValidateLicense;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiscensePlateNumber {
    public static boolean isValidLiscense(String numPlate){
        String regex= "^[A-Z]{2}\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numPlate);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number plate: ");
        Scanner scn = new Scanner(System.in);
        String numPlate=scn.nextLine();
        System.out.println(isValidLiscense(numPlate));
    }
}
