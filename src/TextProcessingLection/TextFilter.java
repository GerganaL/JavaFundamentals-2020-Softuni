package TextProcessingLection;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for (int i = 0; i < bannedWords.length; i++) {
            while (text.contains(bannedWords[i])) {
                text = text.replace(bannedWords[i], replacment("*",bannedWords[i]));
            }
        }
        System.out.println(text);

    }
    public static StringBuilder replacment (String replacemant , String word){
        StringBuilder stringBuilder = new StringBuilder();
        int count = word.length();
        for (int i = 0; i < count ; i++) {
            stringBuilder.append(replacemant);
        }
        return stringBuilder;
    }
}
