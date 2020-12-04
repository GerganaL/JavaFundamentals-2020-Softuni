package MidExamsTechnology;

import java.util.*;
import java.util.stream.Collectors;

public class helloFrance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     //   List<String> shopList = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        String[] input = scan.nextLine().split("\\|");
        double budget = Double.parseDouble(scan.nextLine());

        List<Double> newPrices = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String[] item = input[i].split("->");
            String name = item[0];
            double price = Double.parseDouble(item[1]);
            double maxPrice = 0;
            if (name.equals("Clothes")) {
                maxPrice = 50;
            }else if (name.equals("Shoes")){
                maxPrice = 35;
            }else if (name.equals("Accessories")){
                maxPrice = 20.5;
            }
            if(budget >= price && price <= maxPrice){
                budget-=price;
                newPrices.add(price*1.4);
            }
        }
        double sum = 0;
        for (int i = 0; i < newPrices.size() ; i++) {
            double price = newPrices.get(i);
            sum += price;
            System.out.printf("%.2f ",price);
        }

        System.out.println();

        budget += sum;
        double profit = sum - sum / 1.4;
        System.out.printf("Profit: %.2f%n",profit);

        if (budget >= 150){
            System.out.println("Hello, France!");
        }else {
            System.out.println("Time to go.");
        }

    }
}
