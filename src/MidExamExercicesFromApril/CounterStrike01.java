package MidExamExercicesFromApril;

import java.util.Scanner;

public class CounterStrike01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int countWin = 0;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (initialEnergy - distance < 0){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",
                        countWin,initialEnergy);
                return;
            }else {
                initialEnergy -= distance;
                countWin++;
            }
            if (countWin % 3 == 0){
                initialEnergy +=countWin;
            }
            command = scan.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",countWin, initialEnergy);
    }
}
