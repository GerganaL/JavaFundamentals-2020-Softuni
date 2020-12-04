package MidExamRetakeAugust;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class memoryGame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int moves = 0;
        while (!"end".equals(command) && !input.isEmpty()) {
            moves++;
            String[] indexes = command.split("\\s+");
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);

            if ((index1 < 0 || index1 > input.size() - 1) || ((index2 < 0 || index2 > input.size() - 1))) {
                System.out.println("Invalid input! Adding additional elements to the board");
                input.add(input.size()/2,"-"+moves+"a");
                input.add(input.size()/2,"-"+moves+"a");
            } else if (index1 == index2) {
                System.out.println("Invalid input! Adding additional elements to the board");
                input.add(input.size()/2,"-"+moves+"a");
                input.add(input.size()/2,"-"+moves+"a");
            } else {
                if (input.get(index1).equals(input.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", input.get(index1));
                    input.remove(Math.max(index1, index2));
                    input.remove(Math.min(index1, index2));
                } else {
                    System.out.println("Try again!");
                }
            }

            command = scanner.nextLine();

        }
        if (input.isEmpty()) {
            System.out.printf("You have won in %d turns!", moves);

        } else {
            System.out.println("Sorry you lose :(");
            for (String element : input) {
                System.out.print(element + " ");

            }
        }
    }
}
