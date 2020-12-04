package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element ->Integer.parseInt(element)).toArray();


        for (int i = 0; i <numbers.length ; i++) {
            int currentNumber = numbers[0];
            boolean isTopInt = true;
            for (int  j= i+1; j <numbers.length ; j++) {
                if(numbers[i] <= numbers[j]){
                    isTopInt = false;
                }
            }
            if(isTopInt){
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
