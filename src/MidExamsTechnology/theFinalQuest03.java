package MidExamsTechnology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class theFinalQuest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scan.nextLine();
        while (!command.equals("Stop")) {
            String[] tokens = command.split("\\s+");
            String instruction = tokens[0];
            switch (instruction) {
                case "Delete":
                    int index = (Integer.parseInt(tokens[1]) + 1);
                    if (index >= 0 && index < input.size()) {
                        input.remove(index);
                    }
                    break;
                case "Swap":
                    String word1 = tokens[1];
                    String word2 = tokens[2];
                    if (input.contains(word1) && input.contains(word2)) {
                        int index1 = input.indexOf(word1);
                        int index2 = input.indexOf(word2);

                        input.set(index1, word2);
                        input.set(index2, word1);
                    }
                    break;
                case "Put":
                    word1 = tokens[1];
                    index = (Integer.parseInt(tokens[2]) - 1);
                    if (index >= 0 && index < input.size()) {
                        input.add(index, word1);
                    }
                    if (index == input.size()) {
                        input.add(word1);

                    }
                    break;
                case "Sort":
                    Collections.sort(input, Collections.reverseOrder());
                    break;
                case "Replace":
                    word1 = tokens[1];
                    word2 = tokens[2];
                    if (input.contains(word2)) {
                        index = input.indexOf(word2);
                        input.remove(word2);
                        input.add(index, word1);
                    }
                    break;
            }
            command = scan.nextLine();
        }
        System.out.println(String.join(" ", input));
    }
}
