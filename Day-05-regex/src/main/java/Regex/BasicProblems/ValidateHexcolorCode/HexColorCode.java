package Regex.BasicProblems.ValidateHexcolorCode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static boolean isValidHex(String hexcode){
        String regex = "^#[0-9a-fA-F]{6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexcode);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println("Enter the Hexcode: ");
        Scanner scn = new Scanner(System.in);
        String numPlate=scn.nextLine();
        System.out.println(isValidHex(numPlate));
    }

}
