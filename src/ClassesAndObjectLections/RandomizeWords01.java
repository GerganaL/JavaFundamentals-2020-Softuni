package ClassesAndObjectLections;

import java.sql.ClientInfoStatus;
import java.util.*;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] words = line.split(" ");

        Random randomGenerator = new Random();

        for (int i = 0; i <words.length ; i++) {
           int x = randomGenerator.nextInt(words.length);
           int y = randomGenerator.nextInt(words.length);
            String oldWordX = words[x];
            words[x]= words[y];
            words[y] = oldWordX;

        }
        System.out.println(String.join(System.lineSeparator(),words));

    }
}
