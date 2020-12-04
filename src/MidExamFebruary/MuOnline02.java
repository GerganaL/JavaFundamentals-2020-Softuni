package MidExamFebruary;

import java.util.Arrays;
import java.util.Scanner;


public class MuOnline02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        String[] room = command.split("\\|");
        int currentHealth = 100;
        int healed = 0;
        int bitcoins = 0;
        int sumBitcoins = 0;


        for (int i = 0; i < room.length; i++) {
            String[] token = room[i].split("\\s+");
            switch (token[0]) {
                case "potion":
                    currentHealth += Integer.parseInt(token[1]);
                    if (currentHealth < 100) {
                        healed= Integer.parseInt(token[1]);
                    }else {
                       int sumHealed = currentHealth - 100;
                        healed = Integer.parseInt(token[1]) - sumHealed;
                        currentHealth = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", healed);
                    System.out.printf("Current health: %d hp.%n", currentHealth);
                    break;
                case "chest":
                    bitcoins = Integer.parseInt(token[1]);
                    System.out.printf("You found %d bitcoins.%n", bitcoins);
                    sumBitcoins += bitcoins;
                    break;
                default:
                    String monster = token[0];
                    int attack = Integer.parseInt(token[1]);
                    currentHealth -= attack;
                    if (currentHealth > 0) {
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monster);
                        int bestRoom = i;
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
            }
        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", sumBitcoins, currentHealth);

    }
}
