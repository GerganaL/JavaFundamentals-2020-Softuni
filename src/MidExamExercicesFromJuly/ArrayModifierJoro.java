package MidExamExercicesFromJuly;

import java.util.Scanner;

public class ArrayModifierJoro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String lineOfNumbers = scan.nextLine();
        int[] array = parseArray(lineOfNumbers);

        String line = scan.nextLine();
        while (!line.equals("end")) {
            String[] commandAndParameters = line.split(" ");
            String command = commandAndParameters[0];

            switch (command) {
                case "swap":
                    swap(array, Integer.parseInt(commandAndParameters[1]), Integer.parseInt(commandAndParameters[2]));
                    break;
                case "multiply":
                    multiply(array,Integer.parseInt(commandAndParameters[1]),Integer.parseInt(commandAndParameters[2]));
                    break;
                case "decrease":
                    decrease(array);
                    break;
            }
            line = scan.nextLine();
        }

        printArray(", ", array);

    }

    private static void swap(int[] array, int indexA, int indexB) {
        int oldA = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = oldA;
    }

    private static void multiply(int[] array, int indexA, int indexB) {
        array[indexA] = array[indexA] * array[indexB];
    }

    private static void decrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
    }

    private static void printArray(String separator, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + separator);
            }
        }
        System.out.println();
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
