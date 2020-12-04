package listsLections;

import java.util.*;

public class removeNegativesAndReverse07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listNumbers = readingNumberListFromConsole(scan);
        List<Integer> nonNegative = new ArrayList<>();


        for (int number : listNumbers){
        if (number >= 0){
            nonNegative.add(number);
            }
        }

        Collections.reverse(nonNegative);
        if (nonNegative.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int num : nonNegative) {
                System.out.print(num + " ");

            }
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
