package listsLections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationBasics04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> listFromConsole = readingNumberListFromConsole(scan);

        String command = scan.nextLine();


        while (!(command.equals("end"))){
            String [] tokens = command.split(" ");
            switch (tokens[0]){
                case "Add":
                    int number = Integer.parseInt(tokens[1]);
                    listFromConsole.add(number);
                    break;
                case "Remove":
                   int numberToRemove = Integer.parseInt(tokens[1]);
                    listFromConsole.remove(Integer.valueOf(numberToRemove));
                    break;
                case  "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    listFromConsole.remove(indexToRemove);
                    break;
                case "Insert":
                   int  numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    listFromConsole.add(indexToInsert,numberToInsert);
                    break;
            }

           command = scan.nextLine();
        }

       // System.out.println(listFromConsole.toString().replaceAll("[\\[\\]]",""));
      //  System.out.print("[");
        for (int listElements : listFromConsole){
            System.out.print(listElements + " ");
        }
        //System.out.print("]");
    }

    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String [] numberAsString = line.split(" ");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString){
            int num = Integer.parseInt(s);
            number.add((num));
        }
        return number;
    }
}
