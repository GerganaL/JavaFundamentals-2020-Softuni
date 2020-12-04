package ArraysLections;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReverseArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String[] stringFromConsole = line.split(" ");
        for (int i = 0; i < stringFromConsole.length/2; i++) {
            int swapIndex = stringFromConsole.length-1-i;
            String oldString = stringFromConsole[i];
            stringFromConsole[i] = stringFromConsole[swapIndex];
            stringFromConsole[swapIndex]=oldString;

        }

        for (int i = 0; i <stringFromConsole.length ; i++) {
            System.out.print(stringFromConsole[i] + " ");
        }


    }
}
