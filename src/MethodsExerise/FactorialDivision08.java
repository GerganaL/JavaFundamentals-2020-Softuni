package MethodsExerise;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());

        double result = calculateFactorial(numOne) * 1.0  / calculateFactorial(numTwo);
        System.out.printf("%.2f",result);
    }

    static long calculateFactorial (int num){
        long factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
