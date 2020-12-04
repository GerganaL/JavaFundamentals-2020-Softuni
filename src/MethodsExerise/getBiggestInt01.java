package MethodsExerise;

import java.util.Scanner;

public class getBiggestInt01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int smallestInt = getSmallestInt(a,b,c);
        System.out.println(smallestInt);
    }

    static int getSmallestInt (int a, int b, int c){
        if (a < b && a < c){
            return a;
        }else if (b < a && b < c){
            return b;
        }
        return c;

    }
}
