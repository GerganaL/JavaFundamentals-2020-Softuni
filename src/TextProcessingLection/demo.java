package TextProcessingLection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] words = scan.nextLine().split(" ");

        List<String> repeated = new ArrayList<>();

        for (int i = 0; i < words.length ; i++) {
            repeated.add(repeat(words[i],words[i].length()));
        }

        System.out.println(String.join("",repeated));
    }

    private static String repeat(String word, int count) {
        String [] repeatArray = new String[count];
        for (int i = 0; i < count ; i++) {
            repeatArray[i] = word;
        }

        return String.join("",repeatArray);
    }

}