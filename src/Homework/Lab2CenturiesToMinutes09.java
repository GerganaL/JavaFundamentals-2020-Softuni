package Homework;

import java.util.Scanner;

public class Lab2CenturiesToMinutes09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int centuries = scan.nextInt();
        int years = centuries*100;
        int days = (int) (years * 365.2422 );
        int hours = days*24;
        int minutes = hours*60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = " +
                "%d minutes", centuries,years,days,hours,minutes);
    }
}
