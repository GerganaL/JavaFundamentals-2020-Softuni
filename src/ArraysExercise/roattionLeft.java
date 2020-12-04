package ArraysExercise;

import java.util.Scanner;

public class roattionLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arrInput = scan.nextLine();
        String [] arrayString = arrInput.split(" ");
        int [] arr = new int [arrayString.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= Integer.parseInt(arrayString[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
           // System.out.print(arr[i] + " ");
        }

        int rotation = scan.nextInt();

       // System.out.println("Original array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        for(int i = 0; i < rotation; i++){
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length-1; j++){

                arr[j] = arr[j+1];
            }

            arr[j] = first;
        }
        System.out.println();
       // System.out.println("Array after left rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
