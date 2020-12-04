package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bombNumbers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = readingNumberListFromConsole(scan);

        List<Integer> bombInfo = readingNumberListFromConsole(scan);

        int bombNum = bombInfo.get(0);
        int power = bombInfo.get(1);

        while (list.contains(bombNum)) {
            int bombPosition = list.indexOf(bombNum);

            int leftBound = Math.max(0, bombPosition - power);
            int rightBound = Math.min(list.size() - 1, bombPosition + power);
            for (int i = rightBound; i >= leftBound; i--) {
                list.remove(i);
            }
        }
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        System.out.println(sum);

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
