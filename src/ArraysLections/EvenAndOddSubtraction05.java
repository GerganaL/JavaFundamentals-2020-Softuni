package ArraysLections;

import java.util.Scanner;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String [] numberString = line.split(" ");

        int [] numberArray = new int [numberString.length];
        for (int i = 0; i <numberArray.length ; i++) {
            numberArray[i]= Integer.parseInt(numberString[i]);
        }

        int sumOdd = 0;
        int sumEven = 0;
        for (int number : numberArray){
            if (number%2==0){
                sumEven += number;
            }else{
                sumOdd += number;
            }

        }

        System.out.println(sumEven-sumOdd);
    }
}
