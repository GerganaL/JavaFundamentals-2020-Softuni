package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOperations04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = readingNumberListFromConsole(scan);

        String command = scan.nextLine();
        while (!command.equals("End")){
            String [] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Add":
                    list.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if ( index >= 0 && index < list.size()) {
                        int numberToInsert = Integer.parseInt(tokens[1]);
                       list.add(index,Integer.parseInt(tokens[1]));
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                     index = Integer.parseInt(tokens[1]);
                     if (index >= 0 && index < list.size()) {
                         list.remove(index);
                     }else {
                         System.out.println("Invalid index");
                     }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    shift(list,direction,count);
            }

            command = scan.nextLine();
        }

        for (int n : list){
            System.out.print(n + " ");
        }

    }

    static void shift (List<Integer> numbers, String direction, int count){
        switch (direction){
            case "left":
                for (int i = 0; i <count ; i++) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(first);
                }
            break;
            case "right":
                for (int i = 0; i <count ; i++) {
                    int last = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,last);
                }
                break;
        }
    }
    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String[] numberAsString = line.split(" ");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString) {
            int num = Integer.parseInt(s);
            number.add((num));
        }
        return number;
    }
}
