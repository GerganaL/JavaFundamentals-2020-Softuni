package TextProcessingEx;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        for (char symbol : text.toCharArray()) {
            System.out.print((char) (symbol + 3));
        }
    }
}
