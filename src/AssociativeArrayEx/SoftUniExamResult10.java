package AssociativeArrayEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResult10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> users = new HashMap<>();

        Map<String, Integer> languages = new HashMap<>();

        String input = scan.nextLine();

        while (!input.equals("exam finished")) {

            String [] tokens = input.split("-");
            String username = tokens[0];
            String language = tokens[1];
            if(language.equals("banned")){
                users.remove(username);

                input = scan.nextLine();
                continue;
            }
            int currentPoints = Integer.parseInt(tokens[2]);

            if (!users.containsKey(username)){
                users.put(username,currentPoints);

            }else {
                int points = users.get(username);
                if (points < currentPoints){
                    users.put(username,currentPoints);
                }

            }

            if(!languages.containsKey(language)){
                languages.put(language,1);
            }else {
                languages.put(language,languages.get(language) + 1);
            }
            input = scan.nextLine();

        }

        System.out.println("Results:");

        users.entrySet().stream().sorted((f,s) -> {
            int result = s.getValue().compareTo(f.getValue());
            if (result == 0){
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        })
                .forEach(entry ->{
                    String username = entry.getKey();
                    int points = entry.getValue();
                    System.out.printf("%s | %d%n",username,points);
                });


        System.out.println("Submissions:");

       languages.entrySet().stream().sorted((f,s) ->{
           int result = s.getValue().compareTo(f.getValue());
           if(result == 0){
               result = f.getKey().compareTo(s.getKey());
           }
           return result;
       }).forEach(entry->{
               String language = entry.getKey();
                int count = entry.getValue();
           System.out.printf("%s - %d%n", language, count);
       });
    }
}
