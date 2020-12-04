package MidExamExercicesFromJuly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = readingNumberListFromConsole(scan);
        double average = calculateAverage(numbers);
        List<Integer> greater = new ArrayList<>();
        List<Integer> greaterThan5 = new ArrayList<>();
        for (int current : numbers){
            if(current > average){
                greater.add(current);
            }
        }
        if (greater.size() < 1){
            System.out.println("No");
        }else if (greater.size() > 5){
            for (int i = 0; i < greater.size(); i++) {
                greaterThan5.add(Integer.valueOf(greater.get(i)));
            }
            Collections.sort(greaterThan5);
            Collections.reverse(greaterThan5);
            for (int i = 0; i < 5; i++) {
                System.out.print(greaterThan5.get(i) + " ");
            }
        }else {
            Collections.sort(greater);
            Collections.reverse(greater);
            for (int i = 0; i < greater.size() ; i++) {
                System.out.print(greater.get(i) + " ");
            }
        }
    }

    private static double calculateAverage(List <Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Integer mark : numbers) {
            sum += mark;
        }

        return sum / numbers.size();
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
