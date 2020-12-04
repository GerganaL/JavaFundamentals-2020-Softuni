package MethodsLections;

import java.util.Scanner;

public class PrintingTriangle03 {
    public static void main(String[] args) {


        int maxLineLength = new Scanner (System.in).nextInt();

        for (int i = 1; i <= maxLineLength; i++) {
            printingLineOfNumbers(i);
        }

        for (int i = maxLineLength - 1; i >= 1; i--) {
            printingLineOfNumbers(i);
        }

    }

    static void printingLineOfNumbers(int maxNumber) {
        for (int i = 1; i <=maxNumber; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
