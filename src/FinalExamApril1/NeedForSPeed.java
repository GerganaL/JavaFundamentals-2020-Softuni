package FinalExamApril1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSPeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Integer> carKilometers = new TreeMap<>();
        Map<String,Integer> carFuel = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String infoCar = scan.nextLine();
            String [] info = infoCar.split("\\|");
            carKilometers.putIfAbsent(info[0],Integer.parseInt(info[1]));
            carFuel.putIfAbsent(info[0],Integer.parseInt(info[2]));
        }

        String commands = scan.nextLine();

        while (!commands.equals("Stop")){
            String [] tokens = commands.split(" : ");
            switch (tokens[0]){
                case "Drive":
                    String car = tokens[1];
                    int distance = Integer.parseInt(tokens[2]);
                    int fuel = Integer.parseInt(tokens[3]);
                    if(carFuel.get(car) >= fuel){
                    carFuel.put(car,carFuel.get(car) - fuel);
                    carKilometers.put(car,carKilometers.get(car) + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);
                        if(carKilometers.get(car) >= 100000){
                            System.out.printf("Time to sell the %s!%n",car);
                            carFuel.remove(car);
                            carKilometers.remove(car);
                        }
                    }else{
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    String caR = tokens[1];
                    int fueL = Integer.parseInt(tokens[2]);
                    int plusNewFuel = carFuel.get(caR) + fueL;
                    if(plusNewFuel > 75){
                        plusNewFuel -= fueL;
                        plusNewFuel = 75 - plusNewFuel;
                        System.out.println(caR +" refueled with "+plusNewFuel+" liters");
                        carFuel.put(caR, carFuel.get(caR) + plusNewFuel);
                    }else {
                        carFuel.put(caR, plusNewFuel);
                        System.out.println(caR + " refueled with " + fueL + " liters");
                    }
                    break;
                case "Revert":
                    String carName = tokens[1];
                    int km = Integer.parseInt(tokens[2]);
                    carKilometers.put(carName,carKilometers.get(carName)-km);
                    if(carKilometers.get(carName) < 10000){
                        carKilometers.put(carName,10000);
                    }else{
                        System.out.println(carName +" mileage decreased by "+ km +" kilometers");
                    }
                    break;
            }


            commands = scan.nextLine();
        }

        carKilometers.entrySet().stream()
                .sorted((a,b)->b.getValue().compareTo(a.getValue())).forEach((entry ->
                System.out.println(entry.getKey() + " -> Mileage: "+
                       entry.getValue() +" kms, Fuel in the tank: "+
                       carFuel.get(entry.getKey()) +" lt.")));

    }
}
