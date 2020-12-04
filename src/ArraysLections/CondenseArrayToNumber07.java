package ArraysLections;

import java.util.Scanner;

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] input = scan.nextLine().split("\\s+");

        int [] arrayNumbers = new int[input.length];

        for (int i = 0; i <arrayNumbers.length ; i++) {
            arrayNumbers[i]=Integer.parseInt(input[i]);
            }
        while(arrayNumbers.length>1){
            int [] condensed = new int[arrayNumbers.length-1];
            for (int i = 0; i < arrayNumbers.length-1; i++) {
                condensed[i] = arrayNumbers[i] + arrayNumbers[i + 1];
            }
            arrayNumbers=condensed;
        }
        System.out.println(arrayNumbers[0]);


    }


    }

