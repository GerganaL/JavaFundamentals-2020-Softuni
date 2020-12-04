package MidExamFebruary;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] neighborhood = Arrays.stream(scan.nextLine()
                .split("@")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String[] command = scan.nextLine().split("\\s+");
        int startIndex = 0;
        int placesWith0 = 0;
        int currentIndex = 0;

        while (!command[0].equals("Love!")) {
            int length = Integer.parseInt(command[1]);
            currentIndex += length;
            if (currentIndex >= neighborhood.length) {
                currentIndex = 0;
            }
            if (neighborhood[currentIndex] != 0) {
                neighborhood[currentIndex] -= 2;
                if (neighborhood[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                    placesWith0++;
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
            command = scan.nextLine().split("\\s+");
        }

        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        boolean isSuccessful = true;
        for (int house : neighborhood) {
            if (house != 0) {
                isSuccessful = false;
                break;
            }
        }
        int count = 0;
        for (int house : neighborhood) {
            if (house != 0) {
                count++;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}


