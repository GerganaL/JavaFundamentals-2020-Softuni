package MoreExMethods;

import java.util.Scanner;

public class longLines03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        int x4 = scan.nextInt();
        int y4 = scan.nextInt();

        double line1 = Math.sqrt((x1- x2)*(x1- x2) + (y1- y2)*(y1 - y2));
        double line2 = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4)*(y3 - y4));
        if (line1 >= line2){
            boolean first = true;
            if (Math.sqrt(x1*x1 + y1*y1) > Math.sqrt(x2 * x2 + y2 * y2)) {
                first = false;
            }
            if (first) {
                System.out.printf("(%d, %d) (%d, %d)", x1, y1, x2, y2);
            }else {
                System.out.printf("(%d, %d) (%d, %d)",x2,y2,x1,y1);
            }
        }
        else {
            boolean first = true;
            if (Math.sqrt(x3 * x3 + y3 * y3) > Math.sqrt(x4 * x4 + y4 * y4)) {
                first = false;
            }
            if (first) {
                System.out.printf("(%d, %d)(%d, %d)",x3,y3,x4,y4);
            }else {
                System.out.printf("(%d, %d)(%d, %d)",x4,y4,x3,y3);
            }
        }
    }




}
