package listMoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = readingNumberListFromConsole(scan);
        String message = scan.nextLine();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int index = CalculateIndex(currentNumber);

            char currentChar = GetCharFromMessage(index, message);
            System.out.print(currentChar);

            int realIndex = calculateRealIndex(index, message);
            StringBuilder ne = new StringBuilder(message);
            ne.deleteCharAt(realIndex);
            message = ne.toString();
        }
        System.out.println();
    }

    static int CalculateIndex(int number) {
        int index = 0;
        while (number > 0) {
            int currentNumber = number % 10;
            index += currentNumber;
            number /= 10;
        }

        return index;
    }


    static char GetCharFromMessage(int index, String message) {
        int countIndex = 0;
        for (int i = 0; i < index; i++) {
            countIndex++;
            if (countIndex == message.length()) {
                countIndex = 0;
            }
        }

        char currentChar = message.charAt(countIndex);
        return currentChar;
    }

    static int calculateRealIndex(int index, String message) {
        int countIndex = 0;
        for (int i = 0; i < index; i++) {
            countIndex++;
            if (countIndex == message.length()) {
                countIndex = 0;
            }
        }
        return countIndex;
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
