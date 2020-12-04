package RegexEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String userRegex = "((?<=\\s)[a-zA-Z0-9]+([-.]\\w*)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,}))";

        Pattern userPattern = Pattern.compile(userRegex);
        Matcher matcher = userPattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
