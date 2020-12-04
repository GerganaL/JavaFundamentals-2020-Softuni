package listsLections;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> numbers = readingNumberListFromConsole(scan);

        //List<Integer> nonNegativeNumbers = new ArrayList<>();

        boolean search = true;
        while(search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                double current = numbers.get(i);
                double next = numbers.get(i + 1);

                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    search = true;
                    break;
                }
                search = false;
            }

        }

           String output = joinElementByDelimiter(numbers," ");
            System.out.print(output);

    }

    static String joinElementByDelimiter (List<Double> numbers, String delimiter){
        String output = "";
        for (double num : numbers)
            output += (new DecimalFormat("0.#").format(num)+ delimiter);
        return output;
    }

    /* int = 0;
    while (i < numbers.size() - 1){
    int current = numbers.get(i);
    int next = numbers.get(i + 1);
        if (current == next){
            numbers.remove(i);
            numbers.set(i, current + next);
            i = 0;
        } else {
            i++;
        }
    }


    */

    private static List<Double> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String [] numberAsString = line.split(" ");
        List<Double> number = new ArrayList<>();
        for (String s : numberAsString){
            double num = Double.parseDouble(s);
            number.add((num));
        }
        return number;
    }
}
