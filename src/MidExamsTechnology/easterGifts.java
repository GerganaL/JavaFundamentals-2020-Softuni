package MidExamsTechnology;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class easterGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*String[] input = scan.nextLine().split("\\s+");
        int[] gifts = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            gifts[i] = Integer.parseInt(input[i]);
        }*/
        /* int [] gifts = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();*/

        List<String> gifts = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        String commands = scan.nextLine();
        while (!commands.equals("No Money")) {
            String[] tokens = commands.split(" ");
            String command = tokens[0];
            String currentGift = tokens[1];
            switch (command) {
                case "OutOfStock":
                    while (gifts.contains(currentGift)) {
                        int index = gifts.indexOf(currentGift);
                        gifts.set(index, "None");
                    }
                    break;
                case "Required":
                    int index = Integer.parseInt(tokens[2]);
                    if (index >=0 && index < gifts.size()){
                        gifts.set(index,currentGift);
                    }
                    break;
                case "JustInCase":
                    gifts.set(gifts.size()-1,currentGift);
                    break;
            }
            commands = scan.nextLine();
        }
        IntStream.range(0, gifts.size()).filter(i -> !gifts.get(i).equals("None"))
                .mapToObj(gifts::get).map(s -> s + " ").forEach(System.out::print);

    }
}
