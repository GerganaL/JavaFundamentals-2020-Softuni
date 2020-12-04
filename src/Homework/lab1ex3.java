package Homework;

import java.util.Scanner;

public class lab1ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        if(input>2.99){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
