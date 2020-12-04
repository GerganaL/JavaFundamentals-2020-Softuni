package ArraysLections;

import java.util.Scanner;

public class SumOfEvenNumbers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        String [] numberAsString = line.split(" ");

        int sum = 0;
        int [] numbersAsArray = new int [numberAsString.length];
        for (int i = 0; i <numbersAsArray.length ; i++) {
            numbersAsArray[i]=Integer.parseInt(numberAsString[i]);
        }
        for(int number: numbersAsArray){
            if(number%2==0){
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
