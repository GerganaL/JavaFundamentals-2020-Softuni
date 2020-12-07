package FinalExamAugust2019;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = Integer.parseInt(scan.nextLine());

        Map<String,Integer> plantRarity = new LinkedHashMap<>();
        Map<String,List<Integer>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
          String input = scan.nextLine();
          String [] information = input.split("<->");
          String namePlant = information[0];
          int rarityPlant = Integer.parseInt(information[1]);
          plantRarity.putIfAbsent(namePlant,0);
          plantRating.putIfAbsent(namePlant,new ArrayList<>());
          if(plantRarity.containsKey(namePlant)){
              plantRarity.put(namePlant,rarityPlant);
          }
        }
        String inputCommand = scan.nextLine();
        while (!inputCommand.equals("Exhibition")){
            String [] command = inputCommand.split(": ");
            switch (command[0]){
                case "Rate":
                    String [] info = command[1].split(" - ");
                    String plant = info[0];
                    int rating = Integer.parseInt(info[1]);
                    if(plantRating.containsKey(plant)){
                        List<Integer> rate = plantRating.get(plant);
                        rate.add(rating);
                        plantRating.put(plant,rate);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String [] infoRarity = command[1].split(" - ");
                    String plantN = infoRarity[0];
                    int newRarity = Integer.parseInt(infoRarity[1]);
                    if(plantRarity.containsKey(plantN)){
                        plantRarity.put(plantN,newRarity);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String namePlant = command[1];
                    if(plantRating.containsKey(namePlant)){
                        List<Integer> remove = plantRating.get(namePlant);
                        remove.clear();
                        plantRating.put(namePlant, remove);
                    }else{
                        System.out.println("error");
                    }

                    break;
                default:
                    System.out.println("error");
                    break;
            }
            inputCommand = scan.nextLine();
        }

        System.out.println("Plants for the exhibition: ");

        plantRarity.entrySet().stream()
                .sorted((a,b)->{
                    int aRarity = a.getValue();
                    int bRarity = b.getValue();

                    if(aRarity != bRarity){
                        return Integer.compare(bRarity,aRarity);
                    }else {
                        List<Integer> aRatingList = plantRating.get(a.getKey());
                        List<Integer> bRatingList = plantRating.get(b.getKey());
                        double aAverage = calculateAverage(aRatingList);
                        double bAverage = calculateAverage(bRatingList);

                        return Double.compare(bAverage,aAverage);
                    }
                })
                .map(entry -> "- " + entry.getKey() + "; Rarity: "+ entry.getValue() +
                        "; Rating: "+ String.format("%.2f",
                        calculateAverage(plantRating.get(entry.getKey()))))
                .forEach(s -> System.out.println(s));


}
    static double calculateAverage (List<Integer> numbers){
        if (numbers.isEmpty()){
            return 0;
        }

        double sum = 0;
        for(Integer num: numbers){
            sum += num;
        }

        return sum / numbers.size();
    }
}
