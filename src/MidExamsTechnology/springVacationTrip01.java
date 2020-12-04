package MidExamsTechnology;

import java.io.Console;
import java.util.Scanner;

public class springVacationTrip01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double fuelPerKM = Double.parseDouble(scan.nextLine());
        double food = Double.parseDouble(scan.nextLine());
        double room = Double.parseDouble(scan.nextLine());

        if (people > 10)
        {
            room *= 0.75;
        }
        double expenses = days * people * (food + room);

        for (int i = 1; i <= days; i++)
        {
            double travelledDistance = Double.parseDouble(scan.nextLine());
            expenses += travelledDistance * fuelPerKM;

            if (i % 3 == 0 || i % 5 == 0)
            {
                expenses *= 1.4;
            }
            if (i % 7 == 0)
            {
                expenses -= expenses / people;
            }

            if (expenses > budget)
            {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",expenses-budget);
                return;
            }
        }
        System.out.printf("You have reached the destination. You have %.2f$ budget left.",budget-expenses);
    }
}
