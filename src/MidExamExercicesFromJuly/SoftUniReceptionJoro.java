package MidExamExercicesFromJuly;

import java.util.Scanner;

public class SoftUniReceptionJoro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacityPerHours = scan.nextInt() + scan.nextInt() + scan.nextInt();
        int studentsRemaining = scan.nextInt();

        int hours = 0;
        while (studentsRemaining > 0) {
            hours++;
            if(hours % 4 != 0){
                studentsRemaining -= capacityPerHours;
            }
        }

        System.out.printf("Time needed: %dh.%n", hours);
    }
}
