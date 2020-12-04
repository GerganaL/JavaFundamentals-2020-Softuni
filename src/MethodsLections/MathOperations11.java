package MethodsLections;

import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());
        int sum = calculate(a,operator,b);
        System.out.println(sum);

    }

    static int calculate (int a, String operator, int b){
        int sum = 0;
        switch (operator){
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "*":
                sum = a * b;
                break;
            case "/":
                sum = a / b;
                break;
        }
        return sum;
    }
}
