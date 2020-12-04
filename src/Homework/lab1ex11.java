package Homework;

import java.util.Scanner;

public class lab1ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());

        int total =0;
        if(multiplier>10){
            System.out.printf("%d X %d = %d",input,multiplier,input*multiplier);
        }
        for (int i = multiplier; i <=10 ; i++) {
            total= i*input;
            System.out.printf("%d X %d = %d%n",input,i,total);
        }
    }
}
