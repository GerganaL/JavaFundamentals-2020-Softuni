package MoreExMethods;

import java.util.Scanner;

public class miltiplicationSign05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        getSign(num1,num2,num3);
    }

    static void getSign(double num1, double num2, double num3) {
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        }else if ((num1>0 && num2>0 && num3>0) ||
                (num1<0 && num2<0 && num3>0) || (num1<0 && num2>0 && num3<0) || (num1>0 && num2<0 && num3<0)){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }
}
