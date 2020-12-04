package Homework;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class ex1ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ivanChosMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double priceSabers = Double.parseDouble(scan.nextLine());
        double priceRobes = Double.parseDouble(scan.nextLine());
        double priceBelts = Double.parseDouble(scan.nextLine());

        double additionalLightSabers = Math.ceil(0.10*countOfStudents);
        double totalLightSabers = (countOfStudents+additionalLightSabers)*priceSabers;
        double totalRobes = priceRobes*countOfStudents;

        double freeBelts = Math.floor(countOfStudents/6);
        double totalBelts = priceBelts*(countOfStudents-freeBelts);
        double moneyNeed = totalBelts+totalLightSabers+totalRobes;



        if(ivanChosMoney >= moneyNeed){
            System.out.printf("The money is enough - it would cost %.2flv.",moneyNeed);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.",moneyNeed-ivanChosMoney);
        }


    }
}
