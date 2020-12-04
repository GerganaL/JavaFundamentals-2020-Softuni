package AssociativeArrayEx;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>>companies = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String tokens [] = input.split("\\s+->\\s+");
            String companyName = tokens[0];
            String userId = tokens[1];
            if(!companies.containsKey(companyName)){
                companies.put(companyName,new ArrayList<>());
            }
            if(!companies.get(companyName).contains(userId)) {
                companies.get(companyName).add(userId);
            }


            input = scan.nextLine();
        }


        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.println(entry.getKey());

            entry.getValue().forEach(id -> System.out.printf("-- %s%n", id));
        }
    }
}
