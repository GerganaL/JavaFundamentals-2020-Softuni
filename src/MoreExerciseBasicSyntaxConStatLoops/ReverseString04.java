package MoreExerciseBasicSyntaxConStatLoops;

import java.util.Scanner;

public class ReverseString04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringToReverse , reverse = "";
        stringToReverse = scan.nextLine();
        int length = stringToReverse.length();
        for (int i = length-1; i >=0 ; i--) {
            reverse=reverse+stringToReverse.charAt(i);
        }
        System.out.println(reverse);
    }
}
