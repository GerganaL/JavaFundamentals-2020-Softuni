package listsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniCoursePlanning10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String command = scan.nextLine();

        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            switch (tokens[0]) {
                case "Add":
                    if (!list.contains(tokens[1])) {
                        list.add(tokens[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!list.contains(tokens[1])) {
                        if (index >= 0 && index < list.size()) {
                            String title = tokens[1];
                            list.add(index, title);
                        }
                    }
                    break;
                case "Remove":
                    list.remove(tokens[1]);
                    list.remove(tokens[1] + "Exercise");
                    break;
                case "Swap":
                    if (list.contains(tokens[1]) && list.contains(tokens[2])) {
                        int firstTitleIndex = list.indexOf(tokens[1]);
                        int secondTitleIndex = list.indexOf(tokens[2]);
                        list.add(secondTitleIndex, tokens[1]);
                        list.remove(tokens[2]);
                        list.remove(firstTitleIndex);
                        list.add(firstTitleIndex, tokens[2]);

                        String title = tokens[1];
                        if (list.contains(title + "-Exercise")) {
                            if (secondTitleIndex == list.size() - 1) {
                                list.add(title + "-Exercise");
                            } else {
                                list.add(secondTitleIndex + 1, title + "-Exercise");
                            }
                            list.remove(firstTitleIndex+2);

                        }else if (list.contains(tokens[2] + "-Exercise")) {
                            if(firstTitleIndex == list.size()-1) {
                                list.add(tokens[2]+ "-Exercise");
                            }else {
                                list.add(firstTitleIndex + 1, tokens[2] + "-Exercise");
                            }
                            list.remove(secondTitleIndex+2);
                        }
                    }
                    break;
                case "Exercise":
                    if (list.contains(tokens[1]) && !list.contains(tokens[1] + "-Exercise")) {
                            list.add(list.indexOf(tokens[1])+ 1, tokens[1] + "-Exercise");
                    } else if (!list.contains(tokens[1]+ "-Exercise")){
                        list.add(tokens[1]);
                        list.add(tokens[1]+"-Exercise");
                    }
                    break;
            }
            command = scan.nextLine();
        }

        int nomeration = 1;
        for (
                String subject : list) {
            System.out.println(nomeration + "." + subject);
            nomeration++;
        }
    }
}
