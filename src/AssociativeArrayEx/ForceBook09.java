package AssociativeArrayEx;

import com.sun.source.doctree.LiteralTree;

import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> users = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("Lumpawaroo")) {
            String[] tokens = null;
            if (input.contains("|")) {
                tokens = input.split("\\s+\\|\\s+");

                String forceSide = tokens[0];
                String forceUser = tokens[1];


                boolean isPresent = false;
                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(forceUser)){
                        isPresent = true;
                        break;
                    }
                }
                if(!isPresent) {
                    if(!users.containsKey(forceSide)){
                        users.put(forceSide,new ArrayList<>());
                        users.get(forceSide).add(forceUser);
                    }else if (!users.get(forceSide).contains(forceUser) && users.containsKey(forceSide)) {
                        users.get(forceSide).add(forceUser);
                    }
                }

            } else {
                tokens = input.split("\\s+->\\s+");

                String forceUser = tokens[0];
                String forceSide = tokens[1];

                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(forceUser)
                            && !entry.getKey().equals(forceSide)) {  //!!!!!

                        users.get(entry.getKey()).remove(forceUser);
                        break;

                        /*users.putIfAbsent(forceSide,new ArrayList<>());
                        users.get(forceSide).add(forceUser);
                        isPresent = true;
                        break;*/
                    }
                }
                if (!users.containsKey(forceSide)) {
                    users.put(forceSide,new ArrayList<>());
                    users.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

                }else if(users.containsKey(forceSide) && !users.get(forceSide).contains(forceUser)) {
                    users.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }
            }

            input = scan.nextLine();
        }


        users.entrySet()
                .stream()
                .filter(user -> user.getValue().size() > 0)
                .sorted(Map.Entry.<String, List<String>>comparingByValue(Comparator.comparing(List::size)).reversed())
                .forEach(s -> {
                    System.out.printf("Side: %s, Members: %d%n",s.getKey(),s.getValue().size());

                    s.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(person -> System.out.printf("! %s%n",person));
                });
    }
}

