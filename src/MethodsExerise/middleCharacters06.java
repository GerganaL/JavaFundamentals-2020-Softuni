package MethodsExerise;

import java.util.Scanner;

public class middleCharacters06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        getMiddle(input);

    }

    static void getMiddle (String input){
        int length = input.length();
        String result = "";
        if (length % 2 != 0){
                System.out.print(input.charAt(length/2));
        }else{
            System.out.print(input.charAt(length/2-1));
            System.out.print(input.charAt(length/2));
        }
    }
}
