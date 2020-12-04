package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] array = scan.nextLine().split(" ");
        int rotation = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <rotation ; i++) {
            String firstElement = array[0];
            //shift left
            for (int j = 0; j <array.length-1; j++) {
                array[j]=array[j+1];
            }
            //add first element to last position
            array[array.length - 1] = firstElement;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
