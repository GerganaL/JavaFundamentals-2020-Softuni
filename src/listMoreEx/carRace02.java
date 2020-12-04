package listMoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carRace02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> line = readingNumberListFromConsole(scan);
        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();

        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < line.size()/2 ; i++) {
            leftSide.add(line.get(i));
        }
        
        for (int i = line.size() - 1; i >= line.size()/2+1; i--) {
            rightSide.add(line.get(i));
        }

        for (int i = 0; i < leftSide.size() ; i++) {
            int currentNumber = leftSide.get(i);
            if (currentNumber == 0){
                leftSum *= 0.8;
            }
            leftSum += currentNumber;
        }

        for (int i = 0; i < rightSide.size() ; i++) {
            int currentNumber = rightSide.get(i);
            if (currentNumber == 0){
                rightSum *= 0.8;
            }
            rightSum += currentNumber;
        }


        if (leftSum < rightSum){
            System.out.printf("The winner is left with total time: %.1f",leftSum);
        }else {
            System.out.printf("The winner is right with total time: %.1f",rightSum);
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
