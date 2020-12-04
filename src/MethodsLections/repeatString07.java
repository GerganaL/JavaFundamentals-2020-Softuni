package MethodsLections;

import java.util.Scanner;

public class repeatString07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int repeat = Integer.parseInt(scan.nextLine());
        String result =returnString(input,repeat);
        System.out.println(result);
    }

    static String returnString (String s, int repeat){
        String result = "";
        for (int i = 0; i < repeat ; i++) {
            result +=s;
        }
        return result;
    }
}
