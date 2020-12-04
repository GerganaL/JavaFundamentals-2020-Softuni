package MoreExMethods;

import java.util.Scanner;

public class centerPoint02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        if (findDiagonal(x1, y1) <= findDiagonal(x2, y2)){
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }

    private static double findDiagonal(int x, int y){
        double a = x * 1.0;
        double b = y * 1.0;

        return Math.sqrt(Math.abs((Math.pow(a, 2)) + (Math.pow(b, 2))));
    }
}
