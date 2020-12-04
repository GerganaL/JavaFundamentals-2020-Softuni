package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cardsGame06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = readingNumberListFromConsole(scan);
        List<Integer> secondPlayer = readingNumberListFromConsole(scan);

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            int first = firstPlayer.get(0);
            int second = secondPlayer.get(0);

            if (first > second) {
                firstPlayer.add(first);
                firstPlayer.add(second);
            }else if (second > first){
                secondPlayer.add(second);
                secondPlayer.add(first);

            }
            firstPlayer.remove(0);
            secondPlayer.remove(0);
        }

        int sum = 0;
        if (!firstPlayer.isEmpty()){
            for (int in : firstPlayer){
                sum += in;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }else {
            for (int in : secondPlayer){
                sum += in;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }

    }

    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String[] numberAsString = line.split("\\s+");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString) {
            int num = Integer.parseInt(s);
            number.add((num));
        }
        return number;
    }
}
