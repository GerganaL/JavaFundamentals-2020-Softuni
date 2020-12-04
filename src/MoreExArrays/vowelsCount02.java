package MoreExArrays;

import java.util.Scanner;

public class vowelsCount02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sc = scan.nextLine();
        int count = getVowelsCount(sc);
        System.out.println(count);
    }

    static int getVowelsCount (String s){
        String s1 = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'i'){
                count ++;
            }

        }
        return count;

    }
}
