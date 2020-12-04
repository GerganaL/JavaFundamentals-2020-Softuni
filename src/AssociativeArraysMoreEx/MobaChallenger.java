package AssociativeArraysMoreEx;

import java.util.*;

public class MobaChallenger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> players = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Season end")) {
            if (input.contains("->")) {
                String[] tokens = input.split(" -> ");
                String name = tokens[0];
                String position = tokens[1];
                int skill = Integer.parseInt(tokens[2]);

                players.putIfAbsent(name, new TreeMap<>());
                players.get(name).putIfAbsent(position, 0);
                if (players.get(name).get(position) < skill) {
                    players.get(name).put(position, skill);
                }
            } else {
                String[] tokens = input.split("\\s+vs\\s+");
                String player1 = tokens[0];
                String player2 = tokens[1];

                if (players.containsKey(player1) && players.containsKey(player2)) {
                    Map<String, Integer> pl1 = players.get(player1);
                    Map<String, Integer> pl2 = players.get(player2);

                    pl1.forEach((key, value) -> pl2.forEach((key1, value1) -> {
                        if ((key.contains(key1))) {
                            if (value > value1) {
                                players.remove(player2);
                            } else {
                                players.remove(player1);
                            }
                        }
                    }));
                }
            }

            input = scan.nextLine();
        }

        Map<String, Integer> totalSkills = new HashMap<>();
        players.forEach((k, v) -> v.forEach((key, value) -> {
            if (!totalSkills.containsKey(k)) {
                totalSkills.put(k, value);
            } else {
                totalSkills.put(k, totalSkills.get(k) + value);
            }

        }));

        totalSkills.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).forEach((s) -> {
            System.out.printf("%s: %d skill%n", s.getKey(), s.getValue());

            players.forEach((key, value) -> {
                if (key.equals(s.getKey())) {
                    value.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach((skill) ->
                                    System.out.printf("- %s <::> %d%n", skill.getKey(), skill.getValue()));

                }
            });

        });


    }
}
