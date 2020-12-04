package Homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex1ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scan.nextLine());

        String typeOfpeople = scan.nextLine();
        String dayOfTheWeek = scan.nextLine();

        double price = 0;
        double cash=0;

        if(typeOfpeople.equals("Students") && dayOfTheWeek.equals("Friday")){
            if(numberOfPeople>=30){
                price= 8.45-8.45*0.15;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }else {
                price = 8.45;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }else if(typeOfpeople.equals("Students") && dayOfTheWeek.equals("Saturday")){
            if(numberOfPeople>=30){
                price= 9.80-9.80*0.15;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }else {
                price = 9.80;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }else if(typeOfpeople.equals("Students") && dayOfTheWeek.equals("Sunday")){
            if(numberOfPeople>=30){
                price= 10.46-10.46*0.15;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }else {
                price = 10.46;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }


        if(typeOfpeople.equals("Business") && dayOfTheWeek.equals("Friday")){
            if(numberOfPeople>=100){
                price= 10.90;
                cash=price*numberOfPeople;
                System.out.printf("Total price: %.2f", cash-10*price);
            }else {
                price = 10.90;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }else if(typeOfpeople.equals("Business") && dayOfTheWeek.equals("Saturday")){
            if(numberOfPeople>=100){
                price= 15.60;
                cash=price*numberOfPeople;
                System.out.printf("Total price: %.2f", cash-10*price);
            }else {
                price=15.60;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }else if(typeOfpeople.equals("Business") && dayOfTheWeek.equals("Sunday")){
            if(numberOfPeople>=100){
                price= 16;
                cash=price*numberOfPeople;
                System.out.printf("Total price: %.2f", cash-10*price);
            }else {
                price = 16;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }

        if(typeOfpeople.equals("Regular") && dayOfTheWeek.equals("Friday")){
            if(numberOfPeople>=10&& numberOfPeople<=20){
                price= 15;
                cash=price*numberOfPeople;
                System.out.printf("Total price: %.2f", cash*0.95);
            }else {
                price = 15;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }else if(typeOfpeople.equals("Regular") && dayOfTheWeek.equals("Saturday")){
            if(numberOfPeople>=10&& numberOfPeople<=20){
                price= 20;
                cash=price*numberOfPeople;
                System.out.printf("Total price: %.2f", cash*0.95);
            }else {
                price = 20;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }else if(typeOfpeople.equals("Regular") && dayOfTheWeek.equals("Sunday")){
            if(numberOfPeople>=10&& numberOfPeople<=20){
                price= 22.50;
                cash=price*numberOfPeople;
                System.out.printf("Total price: %.2f", cash*0.95);
            }else {
                price = 22.50;
                System.out.printf("Total price: %.2f", price * numberOfPeople);
            }
        }



    }
}
