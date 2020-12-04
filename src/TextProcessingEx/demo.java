package TextProcessingEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String split = "(?<symbol>[\\D]*)(?<count>\\d+)";
        Pattern pattern = Pattern.compile(split);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        StringBuilder countSb = new StringBuilder();
        while (matcher.find()) {
            int count = Integer.parseInt(matcher.group("count"));
            String symbol = matcher.group("symbol").toUpperCase();
            for (int i = 0; i < count; i++) {
                sb.append(symbol);
            }
        }
        System.out.printf("Unique symbols used: %d%n", sb.chars().distinct().count());
        System.out.println(sb);
    }
}
