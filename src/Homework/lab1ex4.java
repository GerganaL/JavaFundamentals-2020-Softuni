package Homework;

import java.util.Scanner;

public class lab1ex4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        minutes+=30;
        if(minutes>59){
            hours++;
            minutes-=60;
            if(hours>23){
            hours-=24;
            }
        }
        System.out.printf("%d:%02d",hours,minutes);

    }
}
