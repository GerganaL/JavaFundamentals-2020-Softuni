package MethodsLections;

import java.util.Scanner;

public class SignOfInteger01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        PrintSign(input);
    }

    static void PrintSign (int input){
        if(input > 0){
            System.out.printf("The number %d is positive.",input);
        }else if (input == 0) {
            System.out.printf("The number %d is zero.",input);
        }else {
            System.out.printf("The number %d is negative.",input);
        }
    }
}
