package MethodsLections;

import java.util.Scanner;

public class MultiplyEvenByOdds10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int result = getMultipleOfEvenAndOdds(number);
        System.out.println(result);
    }

    static int getMultipleOfEvenAndOdds(int n) {
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);
        return evenSum * oddSum;

    }

    private static int getOddSum(int n) {
        int oddSum = 0;

        while (Math.abs(n) > 0) {
            int b = n % 10;
            if (b % 2 != 0) {
                oddSum += b;
            }
            n = n / 10;
        }
        return oddSum;
    }

    static int getEvenSum(int number) {
        int evenSum = 0;
        while (Math.abs(number) > 0) {
            int b = number % 10;
            if (b % 2 == 0) {
                evenSum += b;
            }
            number = number / 10;
        }
        return evenSum;
    }
}
