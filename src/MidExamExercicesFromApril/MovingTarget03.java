package MidExamExercicesFromApril;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovingTarget03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> targets = readingNumberListFromConsole(scan);
        String command = scan.nextLine();
        int shot = 0;

        while (!command.equals("End")) {
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[1]);
            switch (tokens[0]) {
                case "Shoot":
                    if (index >= 0 && index < targets.size()) {
                        targets.set(index,targets.get(index) - Integer.parseInt(tokens[2]));
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int valueAdd = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, valueAdd);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(tokens[2]);
                    if ((index - radius >= 0) && index + radius < targets.size()) {
                        for (int i = 1; i <= radius; i++) {
                            targets.remove(index - 1);
                            targets.remove(index);
                            index--;
                        }
                        targets.remove(index);
                    } else {
                        System.out.println("Strike missed!");

                    }
                    break;
            }
            command = scan.nextLine();
        }

        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }

    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String[] numberAsString = line.split("\\s+");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString) {
            int num = Integer.parseInt(s);
            number.add(num);
        }
        return number;
    }
}
