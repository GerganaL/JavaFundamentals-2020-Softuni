package MethodsLections;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getMathPower(number,power)));
    }

    static double getMathPower (double a, double b){
        double result = Math.pow(a,b);
        return  result;
    }
}
