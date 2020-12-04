package listsLections;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listFromConsole = readingNumberListFromConsole(scan);
        String command = scan.nextLine();

        while (!command.equals("end")){
            String [] tokens = command.split(" ");
            switch (tokens[0]){
                case "Contains":
                    if (listFromConsole.contains(Integer.parseInt(tokens[1]))){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")){
                        printEven(listFromConsole);
                    }else {
                        printOdd(listFromConsole);
                    }
                    break;
                case "Get":
                    getSum(listFromConsole);
                    break;
                case "Filter":
                    if (tokens[1].equals("<")){
                    getSmaller(listFromConsole,Integer.parseInt(tokens[2]));
                    }else if (tokens[1].equals("<=")){
                    getEqualSmaller(listFromConsole,Integer.parseInt(tokens[2]));
                    }else if (tokens[1].equals(">")){
                    getBigger(listFromConsole,Integer.parseInt(tokens[2]));
                    }else if (tokens[1].equals(">=")){
                    getEqualBigger(listFromConsole,Integer.parseInt(tokens[2]));
                    }
                    break;
            }
            command = scan.nextLine();
        }
    }

    static void getSmaller (List<Integer> list,int number){
        for (int element : list){
            if (element < number){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    static void getEqualSmaller (List<Integer> list,int number){
        for (int element : list){
            if (element <= number){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    static void getBigger (List<Integer> list,int number){
        for (int element : list){
            if (element > number){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    static void getEqualBigger (List<Integer> list, int number){
        for (int element : list){
            if (element >= number){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    static void getSum (List<Integer> list){
        int sum = 0;
        for (int element : list){
            sum += element;
        }
        System.out.println(sum);
    }

    static void printEven (List<Integer> list){
        for (int even : list){
            if (even % 2 == 0){
                System.out.print(even + " ");
            }
        }
        System.out.println();
    }

    static  void  printOdd (List <Integer> list){
        for (int odd : list){
            if (odd % 2 != 0){
                System.out.print(odd + " ");
            }
        }
        System.out.println();
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
