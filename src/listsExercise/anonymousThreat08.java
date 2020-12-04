package listsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scan.nextLine();

        while (!command.equals("3:1")){
            String [] splitCommand = command.split("\\s+");

            switch (splitCommand[0]){
                case "merge":

                    int startIndex = Integer.parseInt(splitCommand[1]);
                    int endIndex = Integer.parseInt(splitCommand[2]);

                    if (endIndex > input.size() -1){
                        endIndex = input.size()-1;
                    }

                    if (startIndex < 0){
                        startIndex = 0;

                    }

                    int count = startIndex;

                    for (int i = startIndex; i < endIndex ; i++) {
                        String concatenation = input.get(count) + input.get(count+1);
                        input.set(count,concatenation);
                        input.remove(count+1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(splitCommand[1]);
                    int partitions = Integer.parseInt(splitCommand[2]);

                    if (index >= 0  && index < input.size() && partitions >= 0 && partitions <= 100) {
                        String element = input.get(index);
                        List<String> newList = new ArrayList<>();

                        int portionLength = element.length() / partitions;
                        int counter = 0;
                        if (element.length() % partitions == 0) {
                            for (int i = 0; i < partitions; i++) {
                                String concat = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(counter);
                                    concat += symbol;
                                    counter++;
                                }
                                newList.add(concat);
                            }
                        } else {
                            for (int i = 0; i < partitions; i++) {
                                String concat = "";

                                if (i == partitions - 1) {
                                    for (int j = counter; j < element.length(); j++) {
                                        char symbol = element.charAt(counter);
                                        concat += symbol;
                                        counter++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(counter);
                                        concat += symbol;
                                        counter++;
                                    }
                                }
                                newList.add(concat);
                            }
                        }
                        input.remove(index);
                        input.addAll(index, newList);
                    }
                    break;
            }
            command =scan.nextLine();
        }
        for (String item : input){
            System.out.print(item + " ");
        }


    }
}
