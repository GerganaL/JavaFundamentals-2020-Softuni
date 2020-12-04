package MidExamExercicesFromJuly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayModifier02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> array = readingNumberListFromConsole(scan);
        String command = scan.nextLine();
        int index1 = 0;
        int index2 = 0;
        int firstValue = 0;
        int secondValue = 0;

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "swap":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    firstValue = array.get(index1);
                    secondValue = array.get(index2);
                    array.set(index1, secondValue);
                    array.set(index2, firstValue);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    firstValue = array.get(index1);
                    secondValue = array.get(index2);
                    int sum = firstValue * secondValue;
                    array.set(index1, sum);
                    break;
                case "decrease":
                    for (int i = 0; i < array.size(); i++) {
                       firstValue = array.get(i);
                        sum = firstValue - 1;
                        array.set(i,sum);
                    }
                    break;
            }
            command = scan.nextLine();
        }

        for (int i = 0; i < array.size(); i++) {
            if (i == array.size()-1){
                System.out.print(array.get(i) + "");
            }else {
                System.out.print(array.get(i) + ", ");
            }

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
