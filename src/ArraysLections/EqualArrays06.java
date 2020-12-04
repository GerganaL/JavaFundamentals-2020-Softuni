package ArraysLections;

import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstArrayString = scan.nextLine();
        String secondArrayString = scan.nextLine();

        int[] firstArray = parseArray(firstArrayString);

        String[] secondNumbersString = secondArrayString.split(" ");
        int[] secondArray = new int[secondNumbersString.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumbersString[i]);
        }

        boolean identical = true;
        int differentindex = -1;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray [i] != secondArray[i]){
                    differentindex = i;
                    identical = false;
                    break;
                }
            }
        }else{
            identical = false;
        }


        if (identical){
            System.out.print("Arrays are identical.");
            int sum = 0;
            for (int number : firstArray) {
                sum += number;
            }
            System.out.println(" Sum: " + sum);

        }else {
            System.out.println("Arrays are not identical. Found difference at " + differentindex + " index.");
        }


    }

    private static int[] parseArray(String firstArrayString) {
        String[] firstNumberString = firstArrayString.split(" ");
        int[] firstArray = new int[firstNumberString.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumberString[i]);
        }
        return firstArray;
    }
}
