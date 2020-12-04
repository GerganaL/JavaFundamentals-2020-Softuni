package Homework;

import java.util.Scanner;

public class lab1ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while(!(input%2==0)){
            System.out.println("Please write an even number.");
            input = scan.nextInt();
        }
        System.out.println("The number is: " + Math.abs(input));
    }
}
