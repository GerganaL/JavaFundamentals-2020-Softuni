package ArraysLections;

import java.util.Scanner;

public class foreachLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int [] numbers = new int[] {1, 2, 3};

//        for(int number : numbers){
//            System.out.println(number);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//            System.out.println(number);
//        }


        String line = scan.nextLine();
        String [] numbersAsStrings = line.split(" ");

        int [] numbers = new int [numbersAsStrings.length];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= Integer.parseInt(numbersAsStrings[i]);
        }

        int sumOdd = 0;
        int sumEven = 0;
        for (int number : numbers) {
            if (number % 2 == 0){
                sumEven += number;
            }else {
                sumOdd += number;
            }
        }

        System.out.println(sumEven-sumOdd);

    }
}
