package FinalExamApril1;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> populationMap = new TreeMap<>();
        Map<String, Integer> goldMap = new TreeMap<>();

        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            String city = tokens[0];
            String populStr = tokens[1].trim();
            int population = Integer.parseInt(populStr);
            String golsStr = tokens[2].trim();
            int gold = Integer.parseInt(golsStr);
            if (populationMap.containsKey(city) && goldMap.containsKey(city)) {
                int current = populationMap.get(city);
                current += population;
                populationMap.put(city, current);
                int currentGold = goldMap.get(city);
                currentGold += gold;
                goldMap.put(city, currentGold);
            }
            populationMap.putIfAbsent(city, population);
            goldMap.putIfAbsent(city, gold);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("=>");
            String command = tokens[0];
            String town = tokens[1];
            switch (command) {
                case "Plunder": {
                    String peopleStr = tokens[2].trim();
                    int people = Integer.parseInt(peopleStr);
                    String golsStr = tokens[3].trim();
                    int gold = Integer.parseInt(golsStr);

                    int peopleLeft = populationMap.get(town);
                    int goldLeft = goldMap.get(town);

                    peopleLeft = peopleLeft - people;
                    goldLeft = goldLeft - gold;
                    populationMap.put(town, peopleLeft);
                    goldMap.put(town, goldLeft);

                    if (populationMap.get(town) <= 0 || goldMap.get(town) <= 0) {
                        populationMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    } else {
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    }
                }
                break;
                case "Prosper":
                    String golsStr = tokens[2].trim();
                    int gold = Integer.parseInt(golsStr);
                    int goldLeft = goldMap.get(town);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, goldLeft+gold);
                        goldLeft += gold;
                        goldMap.put(town, goldLeft);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        if (goldMap.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", goldMap.size());
        }
        goldMap
                .entrySet()
                .stream()
                .sorted((i1, i2) -> {
                    int result = i2.getValue().compareTo(i1.getValue());
                    if (result == 0) {
                        result = i1.getKey().compareTo(i2.getKey());
                    }
                    return result;
                })
                .forEach(s -> System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg", s.getKey(),
                        populationMap.get(s.getKey()), s.getValue())));
    }
    }


