package MethodsLections;

import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        switch (type){
            case "int":
                int a = Integer.parseInt(scan.nextLine());
                int b = Integer.parseInt(scan.nextLine());
                int result = getMax(a,b);
                System.out.println(result);
                break;
            case "char":
                String first = scan.nextLine();
                String second = scan.nextLine();
                char re = getMax(first.charAt(0),second.charAt(0));
                System.out.println(re);
                break;
            case "string":
                String s1 = scan.nextLine();
                String s2 = scan.nextLine();
                String res = getMax(s1,s2);
                System.out.println(res);
                break;
        }

    }

    static int getMax (int first, int second ){
        if(first>second){
            return  first;
        }
        return second;
    }

    static char getMax (char first, char second ){
        if(first>second){
            return first;
        }
        return second;
    }

    static String getMax (String first, String second ){
        if(first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }
}
