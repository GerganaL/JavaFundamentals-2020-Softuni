package MethodsExerise;

import java.util.Locale;
import java.util.Scanner;

public class passwordValidator04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        boolean isBetween = checkIfIsBetween(input);
        boolean consist = checkIfConsist(input);
        boolean hasTwoDigits = checkIfHaveTwoDigits(input);

        if (isBetween && consist && hasTwoDigits) {
            System.out.println("Password is valid");
        }
        if (!isBetween) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consist) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    static boolean checkIfIsBetween(String password) {
        return  password.length() >= 6 && password.length() <= 10;
    }

    static boolean checkIfConsist(String password) {
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);

            if (!isLetter && !isDigit){
                return false;
            }
        }
        return true;
    }

    static boolean checkIfHaveTwoDigits (String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)){
                count++;
            }
        }
        if (count >= 2){
            return true;
        }
        return false;
    }
}
