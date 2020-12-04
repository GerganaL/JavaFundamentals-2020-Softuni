package MethodsLections;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double area = getRectangleArea(width,length);
        System.out.printf("%.0f",area);
    }

    static double getRectangleArea ( double a, double b){
        return a*b;
    }
}
