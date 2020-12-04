package MidExamExercicesFromJuly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumbersJoro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineOfNumbers = scan.nextLine();
        int[] array = parseArray(lineOfNumbers);
        
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        double average = sum * 1.0 / array.length;

        List<Integer> aboveAverage = new ArrayList<>();
        for (int number : array) {
            if (number > average){
                aboveAverage.add(number);
            }
        }

        Collections.sort(aboveAverage);
        Collections.reverse(aboveAverage);

        if(aboveAverage.size()<1){
            System.out.println("No");
        }else {
            for (int i = 0; i < Math.min(aboveAverage.size(), 5); i++) {
                System.out.print(aboveAverage.get(i) + " ");
            }
        }

    }


    private static int[] parseArray(String numbersStrings) {

        String[] numbersAsStrings = numbersStrings.split(" ");
        int[] array = new int[numbersAsStrings.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        return array;
    }
}
