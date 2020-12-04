package MidExamFebruary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());


        String command = scan.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Urgent":
                    String item = tokens[1];
                    if (!items.contains(item)) {
                        items.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    String item1 = tokens[1];
                    if (items.contains(item1)) {
                        items.remove(item1);
                    }
                    break;
                case "Correct":
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    if (items.contains(oldItem)) {
                        int index = items.indexOf(oldItem);
                        items.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    String item2 = tokens[1];
                    if (items.contains(item2)) {
                        int index = items.indexOf(item2);
                        items.remove(item2);
                        items.add(item2);
                    }
                    break;
            }
            command = scan.nextLine();
        }

        System.out.println(String.join(", ", items));

       /* for (int i = 0; i < items.size() ; i++) {
            if (i == items.size()-1){
                System.out.println(items.get(i));
            }else {
                System.out.print(items.get(i) + ", ");
            }
        }*/
    }
}
