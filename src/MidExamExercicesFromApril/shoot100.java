package MidExamExercicesFromApril;

import java.util.Arrays;
import java.util.Scanner;

public class shoot100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] targets = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        String command = scan.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            int indexTarget = Integer.parseInt(command);
            if (indexTarget >= 0 && indexTarget < targets.length) {
                for (int i = 0; i < targets.length; i++) {
                    int attack = targets[indexTarget];
                    if (targets[i] != -1 &&  i != indexTarget) {
                        if(targets[i] > attack){
                            targets[i] -= attack;
                        }else if (targets[i] <= attack){
                            targets[i] += attack;
                        }
                    }
                }
                targets[indexTarget] = -1;
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
