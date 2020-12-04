package RegexLections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phones);
        List<String> PhoneNumbers = new ArrayList<>();

        while (matcher.find()){
            PhoneNumbers.add(matcher.group());
        }

        System.out.println(String.join(", ",PhoneNumbers));
    }
}
