package MethodsExerise;

import java.util.Scanner;

public class nxnMatrix07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printMatrix(number);
    }

    static void printMatrix (int a){
        for (int i = 0; i <a ; i++) {
            System.out.println();
            for (int j = 0; j < a; j++) {
                System.out.print(a + " ");
            }
        }

    }

    }

