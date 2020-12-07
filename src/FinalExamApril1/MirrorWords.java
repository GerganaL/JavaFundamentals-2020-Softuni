package FinalExamApril1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        List<String> mirror = new ArrayList<>();

        String regex = "([@|#])(?<firstWord>[A-z]{3,})\\1{2}(?<secondWord>[A-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int pairs = 0;
        while (matcher.find()){
            pairs++;
        StringBuilder first = new StringBuilder(String.valueOf(matcher.group("firstWord"))).reverse();
        if(String.valueOf(first).equals(matcher.group("secondWord"))){
            mirror.add(String.format("%s <=> %s",matcher.group("firstWord"),matcher.group("secondWord")));
        }
        }

        if(pairs > 0) {
            System.out.println(pairs + " word pairs found!");
        }else {
            System.out.println("No word pairs found!");
        }

        if(!mirror.isEmpty()) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirror));
        }else {
            System.out.println("No mirror words!");
        }
    }
}
