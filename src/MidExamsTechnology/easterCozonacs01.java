package MidExamsTechnology;

import java.util.Scanner;

public class easterCozonacs01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double price1kgFlour = Double.parseDouble(scan.nextLine());

        int colouredEggs = 0;
        double packOfEggs = price1kgFlour * 0.75;
        double price1lMilk = (price1kgFlour + price1kgFlour * 0.25) / 4;
        double totalPrice = packOfEggs + price1kgFlour + price1lMilk;
        int count = 0;

        while (budget > totalPrice) {
            count++;
            colouredEggs+=3;
            budget -= totalPrice;
            if (count % 3 == 0) colouredEggs -= count - 2;
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",
                count,colouredEggs,budget);
    }
}
