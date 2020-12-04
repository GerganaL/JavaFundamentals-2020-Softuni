package ArraysLections;

import java.util.Scanner;

public class reverseLive {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int [] number = new int[n];
        for (int i = 0; i <number.length ; i++) {
            number[i] = scan.nextInt(); //Integer.parseInt(scan.next());
        }

        int [] numbersReversed = new int [number.length];
        for (int i = 0; i <numbersReversed.length ; i++) {
             numbersReversed[i] = number[number.length -1 -i];
        }

        for (int i = 0; i < numbersReversed.length ; i++) {
            System.out.println(numbersReversed[i] + " ");
        }


        /// принтиране на стринг и инт
//        int [] numbers = new int[]{1, 4 , 6, 13};
//        String [] numbersAsString = new String[numbers.length];
//
//        for (int i = 0; i <numbersAsString.length ; i++) {
//            numbersAsString[i] = String.valueOf(numbers[i]);
//        }
//
//        String s = String.join("-->", numbersAsString);
//        System.out.println(s);


    }

}
