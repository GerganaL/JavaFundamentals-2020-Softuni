package ArraysExercise;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] firstArray = scan.nextLine().split(" ");
        String [] secondArray = scan.nextLine().split(" ");


        for (int i = 0; i < secondArray.length ; i++) {
            for (int j = 0; j <firstArray.length ; j++) {
                if(secondArray[i].equals(firstArray[j])){
                    System.out.print(secondArray[i] + " ");
                }
            }
        }

    }
}
