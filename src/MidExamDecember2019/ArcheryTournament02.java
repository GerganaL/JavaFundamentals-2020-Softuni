package MidExamDecember2019;

import java.util.*;

public class ArcheryTournament02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] targets = Arrays.stream(scan.nextLine().split("\\|+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String [] commands = scan.nextLine().split("@+");
        int sum = 0;

        while (!commands[0].equals("Game over")){
            switch (commands[0]){
                case "Shoot Left":
                    int startIndex = Integer.parseInt(commands[1]);
                    int lengthIndex = Integer.parseInt(commands[2]);
                    if (startIndex >=0 && startIndex < targets.length){
                        int targetIndex = startIndex - lengthIndex;
                        while (targetIndex < 0){
                            targetIndex = targets.length + targetIndex;
                        }
                        if(targets[targetIndex] >= 5){
                            targets[targetIndex] -= 5;
                            sum += 5;
                        }else {
                            sum += targets[targetIndex];
                            targets[targetIndex] = 0;
                        }
                    }
                    break;
                case "Shoot Right":
                    int startIndex2 = Integer.parseInt(commands[1]);
                    int lengthIndex2 = Integer.parseInt(commands[2]);
                    if (startIndex2 >= 0 && startIndex2 < targets.length) {
                        int targetIndex2 = startIndex2 + lengthIndex2;
                        while (targetIndex2 >= targets.length) {
                            targetIndex2 = targetIndex2 - targets.length;
                        }
                        if (targets[targetIndex2] >= 5) {
                            targets[targetIndex2] -= 5;
                            sum += 5;
                        } else {
                            sum += targets[targetIndex2];
                            targets[targetIndex2] = 0;
                        }
                    }
                    break;
                case "Reverse":
                    reverseNumbers(targets);
                    break;
            }
            commands = scan.nextLine().split("@+");
        }
        for (int i = 0; i < targets.length - 1; i++) {
            System.out.print(targets[i] + " - ");
        }
        System.out.println(targets[targets.length - 1]);
        System.out.printf("Iskren finished the archery tournament with %d points!", sum);
    }
    private static int[] reverseNumbers(int[] targetNumbers) {
        for (int i = 0; i < targetNumbers.length / 2; i++) {
            int tempNumber = targetNumbers[i];
            targetNumbers[i] = targetNumbers[targetNumbers.length - 1 - i];
            targetNumbers[targetNumbers.length - 1 - i] = tempNumber;
        }
        return targetNumbers;
    }


/*
    private static int[] parseArray(String numbersStrings) {

        String[] numbersAsStrings = numbersStrings.split(" [|] ");
        int[] array = new int[numbersAsStrings.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        return array;
    }*/
}
