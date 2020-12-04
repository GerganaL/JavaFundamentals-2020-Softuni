package TextProcessingEx;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String first = input.substring(0,input.indexOf(" ")).trim();
        String second = input.substring(input.indexOf(" ")).trim();

        int sum = calculateSumOfChars(first,second);

        System.out.println(sum);
    }

    public static int calculateSumOfChars(String first, String second) {

        int sum = 0;
        for (int i = 0; i < first.length() && i < second.length(); i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        if (first.length() > second.length()){
            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);
            }
        }else {
            for (int i = first.length(); i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }


        return sum;
    }
}
