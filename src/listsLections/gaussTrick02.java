package listsLections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gaussTrick02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOne = readingNumberListFromConsole(scan);
        List<Integer> calculated = new ArrayList<>();


        int i = 0;
        while (i < listOne.size() / 2){
            int sum = listOne.get(i) + listOne.get(listOne.size()-1 - i);
            calculated.add(sum);
            i++;
        }
        if (listOne.size() % 2 != 0){
            calculated.add(listOne.get(listOne.size() / 2));
        }

        System.out.println();

        for (int num : calculated){
            System.out.print(num + " ");
        }

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
