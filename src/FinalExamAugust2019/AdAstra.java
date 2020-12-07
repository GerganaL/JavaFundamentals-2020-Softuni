package FinalExamAugust2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regex = "([#|])(?<name>[A-Za-z]+[ ]?+[A-z]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<cal>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int cal = 0;
        List<String> items = new ArrayList<>();

        while (matcher.find()){
            cal += Integer.parseInt(matcher.group("cal"));
            items.add(matcher.group());
        }
        int days = cal / 2000;
        System.out.println("You have food to last you for: "+days+" days!");

        for (String item : items){
            if(item.contains("#")){
                String [] tokens = item.split("#");
                System.out.println("Item: " + tokens[1] + ", Best before: " + tokens[2] + ", Nutrition: "+ tokens[3]);
            }else {
                String [] token = item.split("\\|");
                System.out.println("Item: " + token[1] + ", Best before: " + token[2] + ", Nutrition: "+ token[3]);
            }
        }
    }
}
