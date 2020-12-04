package Homework;

import java.util.Scanner;

public class lab1ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
       int total =0;
        for (int i = 1; i <=10 ; i++) {
            total= i*input;
            System.out.printf("%d X %d = %d%n",input,i,total);
        }
    }
}
