package MidExamFebruary;

import java.util.Scanner;

public class BonusScoringSystem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int initialBonus = Integer.parseInt(scan.nextLine());

        double maxBonus = Double.MIN_VALUE;
        int maxStudent = 0;
        double totalBonus = 0;

        for (int i = 0; i < students; i++) {
            int attendance = Integer.parseInt(scan.nextLine());
            if (attendance > maxStudent) {
                maxStudent = attendance;
            }

            totalBonus = (attendance*1.0 / lectures) * (5 + (initialBonus));

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;

            }
        }

        System.out.printf("Max Bonus: %.0f.%n" , maxBonus);
        System.out.printf("The student has attended %d lectures.",maxStudent);
    }
}
