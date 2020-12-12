package FinalExamAugust2019;

import java.util.Scanner;

public class NikuldenCharity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encrypted = scan.nextLine();

        String commands = scan.nextLine();
        while (!commands.equals("Finish")) {
            String[] tokens = commands.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Replace":
                    encrypted = replace(encrypted, tokens[1].charAt(0), tokens[2].charAt(0));
                    break;
                case "Cut":
                    encrypted = cut(encrypted, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Make":
                    encrypted = make(encrypted, tokens[1]);
                    break;
                case "Check":
                    check(encrypted, tokens[1]);
                    break;
                case "Sum":
                    int startInddex = Integer.parseInt(tokens[1]);
                    int endInddex = Integer.parseInt(tokens[2]);
                    sum(encrypted, startInddex, endInddex);
                    break;
            }

            commands = scan.nextLine();
        }
    }

    private static void sum(String current, int startInddex, int endInddex) {

        int len = current.length();
        if (!isValidIndex(startInddex, len)) {
            System.out.println("Invalid index!");
            return;
        } else if (!isValidIndex(endInddex, len)) {
            System.out.println("Invalid index!");
            return;
        }
        int sum = 0;
        for (int i = startInddex; i <= endInddex; i++) {
            sum += current.charAt(i);
        }


        System.out.println(sum);
    }

    private static void check(String current, String search) {
        int searchIndex = current.indexOf(search);
        if (searchIndex == -1) {
            System.out.println("Message doesn't contain " + search);
        } else {
            System.out.println("Message contains " + search);
        }
    }

    private static String make(String current, String targetCase) {
        String result = current;
        if (targetCase.equals("Upper")) {
            result = current.toUpperCase();
        } else if (targetCase.equals("Lower")) {
            result = current.toLowerCase();
        }
        
        System.out.println(result);
        return result;
    }

    private static String cut(String current, int startIndex, int endIndex) {
        int len = current.length();
        if (!isValidIndex(startIndex, len)) {
            System.out.println("Invalid index!");
            return current;
        } else if (!isValidIndex(endIndex, len)) {
            System.out.println("Invalid index!");
            return current;
        }
        String firstPart = current.substring(0, startIndex);
        String secondPart = current.substring(endIndex + 1, len);

        String result = firstPart + secondPart;
        System.out.println(result);
        return result;

    }

    private static boolean isValidIndex(int toCheck, int length) {
        return toCheck >= 0 && toCheck < length;
    }

    private static String replace(String current, char searchFor, char replaceWith) {
        String result = current.replace(searchFor, replaceWith);
        System.out.println(result);
        return result;
    }
}
