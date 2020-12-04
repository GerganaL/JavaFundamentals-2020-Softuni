package MidExamFundamentalsJava;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class deckOfCards03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listVehicles = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        int nCommands = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < nCommands; i++) {
            String input = scan.nextLine();
            String[] tokens = input.split(", ");
            switch (tokens[0]) {
                case "Add":
                    String cardName = tokens[1];
                    if (listVehicles.contains(cardName)) {
                        System.out.println("Card is already bought");
                    } else {
                        System.out.println("Card successfully bought");
                        listVehicles.add(cardName);
                    }
                    break;
                case "Remove":
                    cardName = tokens[1];
                    int index = listVehicles.indexOf(cardName);
                    if (listVehicles.contains(cardName)) {
                        System.out.println("Card successfully sold");
                        listVehicles.remove(index);
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < listVehicles.size()) {
                        listVehicles.remove(index);
                        System.out.println("Card successfully sold");
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(tokens[1]);
                    cardName = tokens[2];
                    if  (index >=0 && index < listVehicles.size() ){
                        if (!listVehicles.contains(cardName)) {
                            listVehicles.add(index, cardName);
                            System.out.println("Card successfully bought");
                        }else {
                            System.out.println("Card is already bought");
                        }
                    }else{
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        System.out.print(String.join(", ",listVehicles));
    }
}
