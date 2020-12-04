import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> furniture = new ArrayList<>();
        double finalPrice = 0.0;

        Pattern pattern = Pattern.compile(">>(?<name>[A-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)");

        String input = scan.nextLine();
        while (!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            // ">>{furniture name}<<{price}!{quantity}"
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(name);
                finalPrice += price * quantity;
            }
            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.println(String.format("Total money spend: %.2f", finalPrice));
    }
}