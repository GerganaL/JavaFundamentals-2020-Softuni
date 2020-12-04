package MoreExerciseBasicSyntaxConStatLoops;


import java.util.Scanner;

public class GamingStore03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String gameToBuy = scan.nextLine();
        double balance = Double.parseDouble(gameToBuy);


        double totalMoney = balance;
        double spent = 0;
        double price;

        while (!"Game time".equalsIgnoreCase(gameToBuy = scan.nextLine())) {
            price =0;
            if (balance < 0) {
                System.out.println("Out of money");
                break;
            }
            switch (gameToBuy) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance >= price && price > 0) {
                spent += price;
                balance -= price;
                System.out.printf("Bought %s%n", gameToBuy);
            } else if (balance < price && price > 0) {
                System.out.println("Too Expensive");
            }

        }
        if (balance <= 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, (totalMoney-spent));
        }

    }
}
