package FinalExamApril1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class barcode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(@#+)(?<name>[A-Za-z0-9]{4,}[A-Z])\\1";
        Pattern pattern = Pattern.compile(regex);
        String regex2 = "\\d";
        Pattern pattern2 = Pattern.compile(regex2);

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");

                    String digit = "";
                    Matcher matcher2 = pattern2.matcher(input);
                    while (matcher2.find()) {
                        String current = matcher2.group(0);
                        digit = digit + current;
                    }
                    if (digit.isEmpty()) {
                        System.out.println("Product group: 00");
                    } else {
                        System.out.println("Product group: " + digit);
                    }


            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
