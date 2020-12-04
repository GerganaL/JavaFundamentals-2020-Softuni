package MidExamsTechnology;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class easterShopping03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> shopList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scan.nextLine());
        if(0<numberOfCommands&&numberOfCommands<=100) {
            while (numberOfCommands > 0) {
                String[] currentCommand = scan.nextLine().split(" ");
                String com = currentCommand[0];
                switch (com) {
                    case "Include":
                        String shop = currentCommand[1];
                        shopList.add(shop);
                        break;
                    case "Visit":
                        String firstLast = currentCommand[1];
                        int numberOfShops = Integer.parseInt(currentCommand[2]);
                        int count = 0;
                        if (firstLast.equals("last")) {
                            if (numberOfShops >= 0 && numberOfShops <= shopList.size()) {
                                int left = shopList.size() - numberOfShops;
                                int right = shopList.size() - 1;
                                for (int i = left; i <= right; i++) {
                                    shopList.remove(i);
                                    right--;
                                    i--;
                                }
                            }
                        } else {
                            if (numberOfShops >= 0 && numberOfShops <= shopList.size()) {
                                for (int i = numberOfShops - 1; i >= 0; i--) {
                                    shopList.remove(i);
                                }
                            }
                        }
                        break;
                    case "Prefer":
                        int index1 = Integer.parseInt(currentCommand[1]);
                        int index2 = Integer.parseInt(currentCommand[2]);
                        if (index1 >= 0 && index2 >= 0 && index1 < shopList.size() && index2 < shopList.size()) {
                            String old = shopList.get(index1);
                            shopList.set(index1,shopList.get(index2));
                            shopList.set(index2,old);
                        }
                        break;
                    case "Place":
                        String shopAd = currentCommand[1];
                        int index = Integer.parseInt(currentCommand[2]);
                        if (index >= 0 && index + 1 < shopList.size()) {
                            shopList.add(index + 1, shopAd);
                        }
                        break;
                }
                numberOfCommands--;
            }
        }
        System.out.println("Shops left:");
        System.out.println(String.join(" ",shopList));
    }


}
