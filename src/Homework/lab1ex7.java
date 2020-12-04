package Homework;

import java.util.Scanner;

public class lab1ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOfDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price;
        switch (typeOfDay.toLowerCase()){
            case"weekday":
                if(0<=age && age<=18){
                    price=12;
                    System.out.printf("%d$",price);
                }else if(18<age && age<=64){
                    price=18;
                    System.out.printf("%d$",price);
                }else if(64<age && age<=122){
                    price=12;
                    System.out.printf("%d$",price);
                }else {
                    System.out.println("Error!");
                }
                break;
            case "weekend":
                if(0<=age && age<=18){
                    price=15;
                    System.out.printf("%d$",price);
                }else if(18<age && age<=64){
                    price=20;
                    System.out.printf("%d$",price);
                }else if(64<age && age<=122){
                    price=15;
                    System.out.printf("%d$",price);
                }else {
                    System.out.println("Error!");
                }
                break;
            case "holiday":
                if(0<=age && age<=18){
                    price=5;
                    System.out.printf("%d$",price);
                }else if(18<age && age<=64){
                    price=12;
                    System.out.printf("%d$",price);
                }else if(64<age && age<=122){
                    price=10;
                    System.out.printf("%d$",price);
                }else {
                    System.out.println("Error!");
                }
                break;
        }
    }
}
