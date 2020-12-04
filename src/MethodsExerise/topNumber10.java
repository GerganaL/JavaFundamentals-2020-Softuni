package MethodsExerise;

import java.util.Scanner;

public class topNumber10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i < num; i++) {
            if (divisibleByEight(i) && oddDigit(i))
            System.out.println(i);
        }
    }

    static boolean divisibleByEight(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return (sum % 8 == 0);
    }

    static boolean oddDigit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1) {
                count++;
            }
            num /= 10;
        }
        return count >= 1;

    }
}
