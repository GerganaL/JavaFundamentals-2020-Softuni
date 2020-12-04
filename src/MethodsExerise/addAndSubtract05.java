package MethodsExerise;

import java.util.Scanner;

public class addAndSubtract05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = sum(a,b);
        int subtract = subtract(sum,c);
        System.out.println(subtract);
    }

    static  int sum (int a, int b){
        return a + b;
    }

    static int subtract (int a , int b){
        return a - b;
    }
}
