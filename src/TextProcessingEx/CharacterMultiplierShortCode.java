package TextProcessingEx;

import java.util.Scanner;

public class CharacterMultiplierShortCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        System.out.println(sumStrings(array[0], array[1]));
    }

    static int sumStrings(String str1, String str2) {
        int result = 0;

        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {
            if (i >= str1.length()) {
                result += str2.charAt(i);
            } else if (i >= str2.length()) {
                result += str1.charAt(i);
            } else {
                result += str1.charAt(i) * str2.charAt(i);
            }
        }

        return result;
    }
}
