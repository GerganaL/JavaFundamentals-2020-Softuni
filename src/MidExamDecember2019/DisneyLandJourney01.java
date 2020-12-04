package MidExamDecember2019;

import java.util.Scanner;

public class DisneyLandJourney01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double journeyCost = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double savedEndMonth = 0;
        double spentMoney = 0;


        //if (months >=1 && months <= 12 && journeyCost >= 500 && journeyCost <=10000) {
            for (int i = 1; i <= months ; i++) {
                double bonus = savedEndMonth * 0.25;
                if (i % 4 == 0) {
                    savedEndMonth += bonus;
                }
                if (i >=2 && i % 2 != 0) {
                    spentMoney = savedEndMonth * 0.16;
                    savedEndMonth -= spentMoney;
                }
                savedEndMonth += journeyCost * 0.25;

            }
            if (savedEndMonth >= journeyCost) {
                System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", savedEndMonth - journeyCost);
            } else {
                System.out.printf("Sorry. You need %.2flv. more.", journeyCost - savedEndMonth);
            }
        }
   // }
}
