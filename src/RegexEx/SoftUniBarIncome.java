package RegexEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.*\\d*)\\$$";
        Pattern pattern = Pattern.compile(regex);
        double income = 0;

        while (!input.equals("end of shift")) {
        Matcher match = pattern.matcher(input);
        while (match.find()){
            String name = match.group("name");
            String product = match.group("product");
            int count = Integer.parseInt(match.group("count"));
            double price = Double.parseDouble(match.group("price"));
            //George: Croissant - 20.60
            System.out.printf("%s: %s - %.2f%n",name,product,count*price);
            income += count*price;
        }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f",income);
    }
}
