package Homework;

import java.util.Scanner;

public class lab2LowerToUpper08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();
        String n = "";
        if(letter==letter.toLowerCase()){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
