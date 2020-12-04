package Homework;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Lab2E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i <n ; i++) {
            BigDecimal d  = new BigDecimal( scan.nextLine() );
            sum = sum.add( d );
        }
        System.out.println(sum);
    }
}
