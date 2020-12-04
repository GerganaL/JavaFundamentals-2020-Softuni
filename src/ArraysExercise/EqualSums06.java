package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] elements = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        if(elements.length < 1){
            System.out.println(0);
            return;
        }

        boolean isEquals = false;
        for (int i = 0; i < elements.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            //leftSum
            for (int j = i - 1; j >= 0; j--) {
                leftSum += elements[j];
            }

            //rightSum
            for (int j = i + 1; j < elements.length; j++) {
                rightSum += elements[j];
            }

            if (leftSum == rightSum){
                isEquals = true;
                System.out.println(i);
                break;
            }
        }
        if (!isEquals){
            System.out.println("no");
        }


    }
}
