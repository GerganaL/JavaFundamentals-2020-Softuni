package ArraysExercise;

import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int [] people = new int[n];
        int sum =0;
        for (int i = 0; i <n ; i++) {
             people[i]= Integer.parseInt(scan.nextLine());
            System.out.print(people[i]+" " );
            sum += people[i];
        }
        System.out.printf("%n%d",sum);

    }
}
