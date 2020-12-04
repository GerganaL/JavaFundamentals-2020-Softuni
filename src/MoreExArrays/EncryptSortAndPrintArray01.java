package MoreExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scan.nextLine());
        int [] numbers = new int[numberOfStrings];
        for (int i = 0; i <numberOfStrings ; i++) {
            String sequence = scan.nextLine();
            int length = sequence.length();
            int sum = 0;
            for (int j = 0; j <sequence.length() ; j++) {
                char currentChar = sequence.charAt(j);
                //check if vowel or consanant
                if(isVowel(currentChar)){
                    sum += currentChar * length;
                }else {
                     sum += currentChar/length;
                }
            }

            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int element: numbers){
            System.out.println(element);
        }
    }

    public static boolean isVowel (char c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }

    public static boolean isConsanant(char c){
        String cons =
                "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c+ "");
    }
}
