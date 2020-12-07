package FinalExamAugust2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> destinations = new ArrayList<>();

        String regex = "([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            destinations.add(matcher.group("destination"));
        }

        System.out.println("Destinations: " + String.join(", ",destinations));
        System.out.println("Travel Points: "+ destinations.stream().mapToInt(i -> i.length()).sum());
    }
}
