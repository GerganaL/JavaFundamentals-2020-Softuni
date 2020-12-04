package MidExamFebruary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inventory03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String command = scan.nextLine();
        while (!command.equals("Craft!")) {
            String[] token = command.split(" - ");
            switch (token[0]) {
                case "Collect":
                    if (!input.contains(token[1])){
                        input.add(token[1]);
                    }
                    break;
                case "Drop":
                    if (input.contains(token[1])){
                        input.remove(token[1]);
                    }
                    break;
                case "Combine Items":
                    String[] split1 = token[1].split(":");
                    if (input.contains(split1[0])){
                        int index = input.indexOf(split1[0]);
                        input.add(index + 1,split1[1]);
                    }
                    break;
                case "Renew":
                    if (input.contains(token[1])){
                        input.remove(token[1]);
                        input.add(token[1]);
                    }
                    break;
            }
            command = scan.nextLine();
        }


        System.out.println(String.join(", ",input));
    }
}
