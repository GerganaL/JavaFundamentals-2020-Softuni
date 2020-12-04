package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appendArrays07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arrays = scan.nextLine().split("\\|");
        String result = "";

        for (int i = arrays.length - 1; i >= 0 ; i--) {
            String [] currentArray = arrays[i].split("\\s+");
            for (int j = 0; j <currentArray.length ; j++) {
                if(!currentArray[j].equals(""))
                result+= currentArray[j] + " ";
            }
        }
        System.out.println(result.trim());

    }

}
