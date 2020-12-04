package AssociativeArrayEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countChars01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> words = new LinkedHashMap<>();

        String input = scan.nextLine();
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                if (words.containsKey(symbol)) {
                    int count = words.get(symbol);
                    words.put(symbol,count+1);
                } else {
                    words.put(symbol,1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
