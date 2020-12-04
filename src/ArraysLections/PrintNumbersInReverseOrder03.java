package ArraysLections;

import java.util.Scanner;

public class PrintNumbersInReverseOrder03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numberOfDigits = scan.nextInt();
        int [] number = new int [numberOfDigits];
        for (int i = 0; i <number.length ; i++) {
            number [i] = scan.nextInt();
        }

        int [] numbersReversed = new int [number.length];
        for (int i = 0; i <numbersReversed.length ; i++) {
            numbersReversed[i] = number[number.length-1-i];
        }

        for (int i = 0; i <numbersReversed.length ; i++) {
            System.out.print(numbersReversed[i] + " ");
        }
    }
}
