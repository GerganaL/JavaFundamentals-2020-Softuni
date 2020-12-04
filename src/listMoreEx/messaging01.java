package listMoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class messaging01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = readingNumberListFromConsole(scan);
        String text = scan.nextLine();

        StringBuilder output = new StringBuilder();
        List<Character> textList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            textList.add(text.charAt(i));
        }
        for (int num: numbersList){
            int index = 0;
            while (num > 0){
                index += num % 10;
                num /= 10;
            }
            if (!(index < textList.size()-1)){
                index = (index % textList.size());
            }
            output.append(textList.get(index));
            textList.remove(index);
        }
        System.out.println(output);
    }


    private static List<Integer> readingNumberListFromConsole(Scanner scan) {
        String line = scan.nextLine();
        String[] numberAsString = line.split("\\s+");
        List<Integer> number = new ArrayList<>();
        for (String s : numberAsString) {
            int num = Integer.parseInt(s);
            number.add((num));
        }
        return number;
    }
}
