package TextProcessingEx;

import java.net.Inet4Address;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < text.length() ; i++) {
            char symbol = text.charAt(i);
            stringBuilder.append(symbol);
            if (symbol == '>'){
                i++;
                int power = text.charAt(i) - '0';
                int j = i ;
                for (; j < i + power && j < text.length() ; j++) {
                    if(text.charAt(j) == '>'){
                        stringBuilder.append('>');
                        power += (text.charAt(j+1) - '0') + 1;
                    }
                }
                i = j - 1;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
