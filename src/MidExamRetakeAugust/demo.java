package MidExamRetakeAugust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shops = readLineOfShops(scanner.nextLine());
        //int countOfCommands = Integer.parseInt(scanner.nextLine());
        int countOfCommands =Integer.parseInt(scanner.nextLine());
        if(0<countOfCommands&&countOfCommands<=100) {
            for (int i = 0; i < countOfCommands; i++) {
                String[] command = scanner.nextLine().split("\\s+");
                //command[1]-->shop ; command[2]-->number/index
                switch (command[0]) {
                    case "Include":
                        includeShop(shops, command[1]);
                        break;
                    case "Visit":
                        if (command[1].equals("first")) {
                            visitFirstNumberOfShops(shops, command[1], Integer.parseInt(command[2]));
                        }
                        if (command[1].equals("last")) {
                            visitLastNumberOfShops(shops, command[1], Integer.parseInt(command[2]));
                        }
                        break;
                    case "Prefer":
                        preferShop(shops, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                        break;
                    case "Place":
                        placeShop(shops, command[1], Integer.parseInt(command[2]));
                        break;
                }
            }
        }

        System.out.println("Shops left:");
        for (String shop : shops) {
            System.out.print(shop + " ");
        }
    }
    private static void placeShop(List<String> shops, String command, int number) {
        if ((number+1) < shops.size() && number >=0) {
            shops.add((number+1),command);
        }
    }
    private static void preferShop(List<String>shops,int shopIndex1,int shopIndex2){
        if(0<=shopIndex1&&shopIndex1<shops.size()&&0<=shopIndex2&&shopIndex2<shops.size()){
            int old = shopIndex1;
            String oldS = shops.get(old);
            shops.set(shopIndex1,shops.get(shopIndex2));
            shops.set(shopIndex2, oldS);
        }
    }

    private static void visitLastNumberOfShops(List<String> shops, String command, int number) {
        if (0<=number && number <= shops.size()) {
            int left = shops.size()-number;
            int right = shops.size()-1;
            for (int i = left; i <= right; i++) {
                shops.remove(i);
                right--;
                i--;
            }
        }
    }
    private static void visitFirstNumberOfShops(List<String> shops, String command, int number) {
        if (0<=number && number <= shops.size()) {
            for (int i = number-1; i >= 0; i--) {
                shops.remove(i);
            }
        }
    }
    private static void includeShop(List<String> shops, String shop) {
        shops.add(shop);
    }
    public static List<String> readLineOfShops(String line) {
        String[] lineAsStrings = line.split("\\s+");
        List<String> elements = new ArrayList<>();
        //чете с краткия foreach
        for (String s : lineAsStrings) {
            elements.add(s);
        }
        return elements;
    }
}



