package MethodsLections;

import java.util.Scanner;

public class Calculation04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
         int a = Integer.parseInt(scan.nextLine());
         int b = Integer.parseInt(scan.nextLine());
         int sum;

         switch (command){
             case "add":
                sum= Add(a,b);
                 System.out.println(sum);
                 break;
             case "divide":
                 sum= Divide(a,b);
                 System.out.println(sum);
                 break;
             case "subtract":
                 sum= Subtract(a,b);
                 System.out.println(sum);
                 break;
             case "multiply":
                 sum= Multiply(a,b);
                 System.out.println(sum);
                 break;
         }
    }

    static int Add (int a, int b){
    return a+b;
    }

    static int Multiply (int a, int b){
        return a*b;
    }

    static int Divide (int a, int b){
        return a/b;
    }

    static int Subtract (int a, int b){
        return a-b;
    }
}
