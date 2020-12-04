package AssociativeArraysMoreEx;

import java.io.Console;
import java.util.*;

public class judge2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Map<String,Integer>>contestInfo=new LinkedHashMap<>();
        String input;
        while (!"no more time".equals(input=scan.nextLine())){
            String[]command=input.split(" -> ");
            String user=command[0]; String contest=command[1]; int points=Integer.parseInt(command[2]);
            contestInfo.putIfAbsent(contest,new TreeMap<>());
            contestInfo.get(contest).putIfAbsent(user,0);
            if(contestInfo.get(contest).get(user)<points){
                contestInfo.get(contest).put(user,points);
            }
        }
        contestInfo.forEach((key, value) -> {
            System.out.printf("%s: %d participants%n", key, value.size());
            var lambdaContext = new Object() { int count = 1; };
            value.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).forEach(v -> {
                System.out.printf("%d. %s <::> %d%n", lambdaContext.count, v.getKey(), v.getValue()); lambdaContext.count++;
            });
        });
        Map<String,Integer>userInfo=new LinkedHashMap<>();
        contestInfo.forEach((key, value) -> value.forEach((key1, value1) -> userInfo.put(key1,
                !userInfo.containsKey(key1) ? value1 : userInfo.get(key1) + value1)));
        System.out.println("Individual standings:"); int count = 0;
        List<Map.Entry<String, Integer>> toSort = new ArrayList<>(userInfo.entrySet());
        toSort.sort(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
        for (Map.Entry<String, Integer> e : toSort) {
            count++;
            System.out.printf("%d. %s -> %d%n", count, e.getKey(), e.getValue());
        }
    }
}