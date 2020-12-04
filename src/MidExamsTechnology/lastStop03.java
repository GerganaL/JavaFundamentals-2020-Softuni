package MidExamsTechnology;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class lastStop03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length ; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        String commands = scan.nextLine();
        while (!commands.equals("END")) {
            String[] tokens = commands.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Insert":
                    int place = (Integer.parseInt(tokens[1])+1);
                    int paintingNumber = Integer.parseInt(tokens[2]);
                    if(place < numbers.size() && place+1 > -1) {
                        numbers.add(place, paintingNumber);
                    }
                    break;
                case "Switch":
                     paintingNumber = Integer.parseInt(tokens[1]);
                    int paintingNumber2 = Integer.parseInt(tokens[2]);
                    if (numbers.contains(paintingNumber) && numbers.contains(paintingNumber2)) {
                        int index1 = numbers.indexOf(paintingNumber);
                        int index2 = numbers.indexOf(paintingNumber2);

                        int num1 = numbers.get(index1);
                        int num2 = numbers.get(index2);

                        numbers.set(index1,num2);
                        numbers.set(index2,num1);

                    }
                    break;
                case "Hide":
                     paintingNumber = Integer.parseInt(tokens[1]);
                    if (numbers.contains(paintingNumber)) {
                        int index = numbers.indexOf(paintingNumber);
                        numbers.remove(index);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(numbers);
                    break;
                case "Change":
                    paintingNumber = Integer.parseInt(tokens[1]);
                    int paintingNumber22 = Integer.parseInt(tokens[2]);
                    if (numbers.contains(paintingNumber)) {
                        int index = numbers.indexOf(paintingNumber);
                        numbers.remove(index);
                        numbers.add(index, paintingNumber22);
                    }
                    break;
            }


            commands = scan.nextLine();
        }

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }


    }
}
