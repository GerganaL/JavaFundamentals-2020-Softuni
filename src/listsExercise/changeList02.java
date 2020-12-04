package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class changeList02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listToChange = readingNumberListFromConsole(scan);
        String command = scan.nextLine();
        while (!command.equals("end")){
            String [] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Delete":
                    int numberToDelete = Integer.parseInt(tokens[1]);
                    while (listToChange.contains(numberToDelete)) {
                        listToChange.remove(Integer.valueOf(numberToDelete));
                    }
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int atIndex = Integer.parseInt(tokens[2]);
                    if (atIndex < listToChange.size()) {
                        listToChange.add(atIndex, numberToInsert);
                    }
                    break;
            }

            command = scan.nextLine();
        }

        for (int element : listToChange){
            System.out.print(element + " ");
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
