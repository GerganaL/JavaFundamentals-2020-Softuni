package MidExamExercicesFromJuly;

import java.util.Scanner;

public class SoftUniReception {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployeeCount = Integer.parseInt(scan.nextLine());
        int secondEmployeeCount = Integer.parseInt(scan.nextLine());
        int thirdEmployeeCount = Integer.parseInt(scan.nextLine());

        int perHour = firstEmployeeCount + secondEmployeeCount + thirdEmployeeCount;
        int countHours = 0;

        int studentsCount = Integer.parseInt(scan.nextLine());

        while (studentsCount > 0) {
            studentsCount -= perHour;

            countHours++;

            if (countHours % 4 == 0) {
                countHours++;
            }
        }

        System.out.printf("Time needed: %dh.", countHours);
    }
}
