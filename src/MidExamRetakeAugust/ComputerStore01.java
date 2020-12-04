package MidExamRetakeAugust;

import java.util.Scanner;

public class ComputerStore01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String prices = scan.nextLine();
        double price = 0;
        double sumNoTaxes = 0;
        double sumTaxes = 0;
        double sumSpecial = 0;
        double sum = 0;
        while (!prices.equals("special") && !prices.equals("regular")) {
            price = Double.parseDouble(prices);
            if (price > 0) {
                sumNoTaxes += price;
                sumTaxes = sumNoTaxes * 0.2;
                sum = sumNoTaxes + sumTaxes;
            }else {
                System.out.println("Invalid price!");
            }
            prices = scan.nextLine();
        }
        if (prices.equals("special") && sum == 0) {
            System.out.println("Invalid order!");
            return;
        }
        if (prices.equals("special")) {
            sumSpecial = (sumNoTaxes + sumTaxes) * 0.9;
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n", sumNoTaxes, sumTaxes, sumSpecial);
        }
        if (prices.equals("regular") && sum == 0) {
            System.out.println("Invalid order!");
            return;
        }
        if (prices.equals("regular")) {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n", sumNoTaxes, sumTaxes, sum);
        }
    }
}
