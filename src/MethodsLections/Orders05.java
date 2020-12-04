package MethodsLections;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        printingSumOfOrders(item,quantity);

    }

    static void printingSumOfOrders(String order, int quantity){
        double price;
        double sum;
        switch (order){
            case "coffee":
                price = 1.50;
                sum = quantity * price;
                System.out.printf("%.2f",sum);
                break;
            case "water":
                price = 1.00;
                sum = quantity * price;
                System.out.printf("%.2f",sum);
                break;
            case "coke":
                price = 1.40;
                sum = quantity * price;
                System.out.printf("%.2f",sum);
                break;
            case "snacks":
                price = 2.00;
                sum = quantity * price;
                System.out.printf("%.2f",sum);
                break;
        }
    }

}
