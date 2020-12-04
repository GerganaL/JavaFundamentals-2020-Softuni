package AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class wordFilter {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        List<String> filtered = Arrays.stream(scan.nextLine().split(" "))
                .filter(w -> w.length() % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(String.join(System.lineSeparator(),filtered));*/

        Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .forEach(w -> System.out.println(w));
        //                .forEach(System.out::println);
    }
}
