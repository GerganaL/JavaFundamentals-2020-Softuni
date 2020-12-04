package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arrayOfString = scan.nextLine().split(" ");
        int [] array = new int[arrayOfString.length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(arrayOfString[i]);
        }

        int givenNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                //System.out.println(array[i] + array[j]);
                if ((array[i] + array [j]) == givenNumber){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }

    }
}
