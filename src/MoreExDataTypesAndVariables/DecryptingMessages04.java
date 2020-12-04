package MoreExDataTypesAndVariables;

import java.util.Scanner;

public class DecryptingMessages04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        int lines = Integer.parseInt(scan.nextLine());
        int l=0;
        String descript = "";
        for (int i = 0; i <lines ; i++) {
            String letter = scan.nextLine();
             l = letter.charAt(0)+key;
             descript+= (char)l;
        }
        System.out.println(descript);
    }
}
