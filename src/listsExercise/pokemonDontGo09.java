package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pokemonDontGo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = readingNumberListFromConsole(scan);
        int sum = 0;

        while (!list.isEmpty()){
            int givenIndex = Integer.parseInt(scan.nextLine());

                if (givenIndex < 0) {
                    int first = list.get(0);
                    sum+= first;
                    list.set(0,list.get(list.size()-1));
                    changeListContent(list,first);
                } else if (givenIndex <= list.size() - 1) {
                    int indexValue = list.get(givenIndex);
                    list.remove(givenIndex);
                    sum += indexValue;
                    changeListContent(list,indexValue);
                } else {
                    int lastElement = list.get(list.size()-1);
                    sum += lastElement;
                    list.set(list.size()-1,list.get(0));
                    changeListContent(list,lastElement);
                }

        }
        System.out.println(sum);

    }
    static void changeListContent (List<Integer> list,int indexValue){
        for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) <= indexValue) {
                            list.set(i, list.get(i) + indexValue);
                        } else {
                            list.set(i, list.get(i) - indexValue);
                        }
                    }
    }

    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String [] numberAsString = line.split("\\s+");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString){
            int num = Integer.parseInt(s);
            number.add((num));
        }
        return number;
    }
}
