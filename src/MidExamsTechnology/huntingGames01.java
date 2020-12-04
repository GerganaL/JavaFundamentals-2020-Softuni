package MidExamsTechnology;

import java.util.Scanner;

public class huntingGames01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int players = Integer.parseInt(scan.nextLine());
        double groupEnergy = Double.parseDouble(scan.nextLine());
        double waterPerDayOnePerson = Double.parseDouble(scan.nextLine());
        double foodPerDayOnePerson = Double.parseDouble(scan.nextLine());

        double totalWater = days * players * waterPerDayOnePerson;
        double totalFood = days * players * foodPerDayOnePerson;

        for (int i = 1; i <=days ; i++) {

           double energyLost = Double.parseDouble(scan.nextLine());
            groupEnergy -= energyLost;
            if (groupEnergy <= 0){
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
                return;
            }
            if(i % 2 == 0){
            groupEnergy += groupEnergy * 0.05;
            totalWater -= totalWater * 0.3;
            }
            if (i % 3 == 0){
            groupEnergy += groupEnergy * 0.1;
            totalFood -= totalFood / players;
            }
        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
    }
}
