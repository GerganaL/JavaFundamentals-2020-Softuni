package MidExamFebruary;

import java.util.Scanner;

public class NationalCourt03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scan.nextLine());
        int secondEmployee = Integer.parseInt(scan.nextLine());
        int thirdEmployee = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());

        int sum = firstEmployee + secondEmployee + thirdEmployee;
        int hours = 0;

        while (people>0){
            hours++;
            if(hours % 4 == 0){
                hours++;
            }
            people -= sum;
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
