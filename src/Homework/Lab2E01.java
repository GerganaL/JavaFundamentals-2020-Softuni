package Homework;

import java.util.Scanner;

public class Lab2E01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int meters = scan.nextInt();
        double km = 1000;
        System.out.printf("%.2f",meters/km);
    }
}
