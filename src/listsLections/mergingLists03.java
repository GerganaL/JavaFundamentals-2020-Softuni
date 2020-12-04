package listsLections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergingLists03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = readingNumberListFromConsole(scan);
        List<Integer> secondList = readingNumberListFromConsole(scan);
        List<Integer> merged = new ArrayList<>();

        int indexFirst = 0;
        int indexSecond = 0;

        while (indexFirst < firstList.size() || indexSecond < secondList.size()){
            if(indexFirst < firstList.size()) {
                merged.add(firstList.get(indexFirst));
            }
            if(indexSecond < secondList.size()) {
                merged.add(secondList.get(indexSecond));
            }
            indexFirst++;
            indexSecond++;
        }

        for (int num : merged){
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
