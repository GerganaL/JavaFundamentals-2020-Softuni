package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] elements = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int maxCount = 0;
        int index = 0;
        int sequence = 0;

        for (int i = 0; i <elements.length ; i++) {
            int count = 0;
            for (int j = i; j < elements.length; j++) {
                if (elements[i] == elements[j]){
                    count++;
                    index = i;
                    if (count > maxCount){
                        maxCount = count;
                        sequence = index;
                    }
                }else {
                    break;
                }
            }
        }

        for (int i = 0; i < maxCount ; i++) {
            System.out.print(elements[i + sequence] + " " );
        }
    }
}
