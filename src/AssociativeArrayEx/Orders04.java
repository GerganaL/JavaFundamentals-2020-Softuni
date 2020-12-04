package AssociativeArrayEx;

import java.util.*;

public class Orders04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        Map<String,Double> orders = new LinkedHashMap<>();
        Map<String,Integer> rememberProducts = new LinkedHashMap<>();



        while (!command.equals("buy")) {
            String [] tokens = command.split(" ");

            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);


            if(!orders.containsKey(product)){
                orders.put(product,quantity*price);
                rememberProducts.put(product,quantity);

            }else {
                rememberProducts.put(product,rememberProducts.get(product) + quantity);
                orders.put(product, rememberProducts.get(product)*price);
            }

        command = scan.nextLine();
        }

        for (Map.Entry<String, Double> entry : orders.entrySet()) {
            System.out.printf("%s -> %.2f\n",entry.getKey(), entry.getValue());
        }
    }
}
