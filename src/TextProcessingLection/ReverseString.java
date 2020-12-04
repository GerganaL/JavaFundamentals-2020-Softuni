package TextProcessingLection;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("end")) {
            reversed(input);
        input = scan.nextLine();
        }

    }

    private static void reversed(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(word.charAt(i));
        }
        System.out.println(word + " = " +stringBuilder.reverse());
    }
}
