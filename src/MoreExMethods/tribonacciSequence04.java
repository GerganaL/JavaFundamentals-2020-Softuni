package MoreExMethods;

import java.util.Scanner;

public class tribonacciSequence04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printTribonacci(num);

    }

    static int getTribonacci (int num) {
        if (num <= 2){
            return 1;
        }
        if (num == 3){
            return 2;
        }else {
            return getTribonacci(num-3) + getTribonacci(num -2) + getTribonacci(num-1);

        }
    }
    static void printTribonacci (int num){
        for (int i = 1; i <= num ; i++) {
            System.out.printf("%d ", getTribonacci(i));
        }

    }}
