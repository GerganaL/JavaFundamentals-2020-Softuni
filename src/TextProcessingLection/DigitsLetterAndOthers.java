package TextProcessingLection;

import java.util.Scanner;

public class DigitsLetterAndOthers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
       char [] in =  input.toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < in.length; i++) {
            if (Character.isDigit(in[i])){
                digits.append(in[i]);
            }else if (Character.isAlphabetic(in[i])){
                letters.append(in[i]);
            }else {
                chars.append(in[i]);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(chars);
    }
}
