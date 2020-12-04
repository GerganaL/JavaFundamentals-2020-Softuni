package MoreExDataTypesAndVariables;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class FloatingEquality02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberA = Double.parseDouble(scan.nextLine());
        double numberB = Double.parseDouble(scan.nextLine());
        double c = numberA-numberB;
        if(Math.abs(c) <= 0.000001){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
