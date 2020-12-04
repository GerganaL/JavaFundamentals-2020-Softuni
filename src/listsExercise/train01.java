package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class train01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> wagons = readingNumberListFromConsole(scan);
        int maxCapacity = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Add")) {
                wagons.add(Integer.parseInt(tokens[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    int number = wagons.get(i);
                    if (number < maxCapacity) {
                        int sum = number + Integer.parseInt(tokens[0]);
                        if (sum <= maxCapacity) {
                            wagons.set(i, sum);
                            break;
                        }
                    }
                }
            }

            command = scan.nextLine();
        }

        for (int pass : wagons) {
            System.out.print(pass + " ");
        }
    }

    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String[] numberAsString = line.split(" ");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString) {
            int num = Integer.parseInt(s);
            number.add((num));
        }
        return number;
    }
}
