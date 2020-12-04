package MidExamExercicesFromApril;

import java.util.Arrays;
import java.util.Scanner;

public class shootForTheWin02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] targets = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        String command = scan.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            int shoot = Integer.parseInt(command);
            if (shoot >= 0 && shoot < targets.length) {
                for (int i = 0; i < targets.length; i++) {
                    int attack = targets[shoot];
                    int value = targets[i];
                    if (targets[i] != -1 && i != shoot ) {
                        if (value > attack) {
                            targets[i] -= attack;
                        } else {
                            targets[i] = value + attack;
                        }
                    }
                }
                targets[shoot] = -1;
                count++;
            }
            command = scan.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int num : targets) {
            System.out.print(num + " ");

        }
    }
}
