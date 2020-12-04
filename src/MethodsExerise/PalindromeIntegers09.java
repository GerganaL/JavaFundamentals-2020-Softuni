package MethodsExerise;

import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        while (!number.equals("END")){
           String currentNum = reversed(number);
            System.out.println(currentNum);
            number = scan.nextLine();
        }

    }

    static String reversed(String number) {
        String output = "";
        StringBuilder reversed = new StringBuilder();

        for (int i = number.length() - 1; i >= 0 ; i--) {
            reversed.append(number.charAt(i));
        }
        if (reversed.toString().equals(number)){
            output = "true";
        }else {
            output = "false";
        }
        return output;
    }
}
