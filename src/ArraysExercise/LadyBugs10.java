package ArraysExercise;

import java.util.Scanner;

public class LadyBugs10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sizeOfField = Integer.parseInt(scan.nextLine());
        int[] field = new int[sizeOfField];
        // System.out.println();
        String[] bugIndex = scan.nextLine().split(" ");

        for (int i = 0; i < bugIndex.length; i++) {
            int indexOfBug = Integer.parseInt(bugIndex[i]);

            if (indexOfBug >= 0 && indexOfBug < field.length) {
                field[indexOfBug] = 1;
            }
        }

        String commandLine = scan.nextLine();

        while (!commandLine.equals("end")) {
            String[] commands = commandLine.split(" ");
            int indexOfBug = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if (indexOfBug < 0 || indexOfBug >= field.length || field[indexOfBug] != 1) {
                commandLine = scan.nextLine();
                continue;
            }
            field[indexOfBug] = 0;

            if (direction.equals("right")) {
                indexOfBug += length;

                //flight
                while (indexOfBug < field.length && field[indexOfBug] == 1) {
                    indexOfBug += length;
                }
                if (indexOfBug < field.length) {
                    field[indexOfBug] = 1;
                }

            } else {

                indexOfBug -= length;

                //flight
                while (indexOfBug >= 0 && field[indexOfBug] == 1) {
                    indexOfBug -= length;
                }
                if (indexOfBug >= 0) {
                        field[indexOfBug] = 1;
                }

            }
            commandLine = scan.nextLine();
        }
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i] + " ");
        }
    }
}
