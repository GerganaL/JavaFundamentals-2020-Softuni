package AssociativeArraysMoreEx;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class Judge {

    public static int count = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> users = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String username = tokens[0];
            String contest = tokens[1];
            int currentPoints = Integer.parseInt(tokens[2]);

            users.putIfAbsent(contest, new TreeMap<>());
            users.get(contest).putIfAbsent(username, 0);
            if (users.get(contest).get(username) < currentPoints) {
                users.get(contest).put(username, currentPoints);
            }
            input = scan.nextLine();
        }

        users.forEach((k, v) -> {
            System.out.printf("%s: %d participants%n", k, v.size());

            v.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).forEach(value -> {
                System.out.printf("%d. %s <::> %d%n", count, value.getKey(), value.getValue());
                count++;
            });
            count = 1;
        });

        Map<String,Integer> individual = new TreeMap<>();
        users.forEach((key,value) -> value.forEach((key1,value1) ->{
              //  individual.put(key1,!individual.containsKey(key1) ? value1 : individual.get(key1) + value1)))
                if(!individual.containsKey(key1)){
                    individual.put(key1,value1);
                }else{
                    individual.put(key1,individual.get(key1) + value1);
                }
        }));
        System.out.println("Individual standings:");
        individual.entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue())).forEach((v) -> {
            System.out.printf("%d. %s -> %d%n", count++, v.getKey(), v.getValue());
        } );
    }

}
