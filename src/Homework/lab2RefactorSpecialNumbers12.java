package Homework;

import java.util.Scanner;

public class lab2RefactorSpecialNumbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= givenNumber; i++) {
            int sum = 0;
            int currentNumber = 0;
            currentNumber = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            boolean trueFalse = (sum == 5) || (sum == 7) || (sum == 11);
            String isTrue = "";
            if (trueFalse){
                 isTrue ="True";
            }
            else {
                isTrue="False";
            }

            System.out.printf("%d -> %s%n", currentNumber,isTrue);
            i = currentNumber;
        }

    }
}
