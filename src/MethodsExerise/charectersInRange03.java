package MethodsExerise;

import java.util.Scanner;

public class charectersInRange03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char char1 =scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        charInRange(char1,char2);
    }

    static void charInRange (char char1, char char2){

        if (char1<char2) {
             int a = char1 + 1;
            char1 = (char) a;
            for (char i = char1; i < char2; i++) {
                System.out.print(i + " ");
            }
        }else {
            int b = char2 + 1;
            char2 = (char) b;
            for (char i = char2; i <char1 ; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
