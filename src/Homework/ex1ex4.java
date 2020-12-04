package Homework;

import java.util.Scanner;

public class ex1ex4 {
    //print and sum 5 to 10 , sum=45
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();
        int sum = 0;
        for (int i = startNumber; i <= endNumber ; i++) {
                sum += i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
