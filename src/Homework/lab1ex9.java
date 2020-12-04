package Homework;

import java.util.Scanner;

public class lab1ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum=0;
        int count = 0;

        for (int i = 1; i <=100 ; i+=2) {
            System.out.println(i);
            count++;
            sum+=i;
            if(count==n){
                System.out.println("Sum: "+ sum);
                break;
            }

        }
    }
}
