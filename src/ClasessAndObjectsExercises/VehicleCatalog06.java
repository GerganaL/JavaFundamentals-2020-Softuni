package ClasessAndObjectsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalog06 {
    static class Car{
       String type; //{typeOfVehicle}
       String model; //{modelOfVehicle}
        String color;// {colorOfVehicle}
       int horsepower; //{horsepowerOfVehicle}

        public Car(String type, String model, String color, int horsepower){
           // this.type = "Car";
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType (){
            return type;
        }

        public String getModel(){
            return model;
        }

        public String getColor (){
            return color;
        }

        public int getHorsepower(){
           return horsepower;
        }
        public String toString (){
            return String.format("Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %d",getType().toUpperCase().charAt(0) + this.getType().substring(1),this.getModel(),this.getColor(),this.getHorsepower());
        }
    }

    static class Truck{
        String type; //{typeOfVehicle}
        String model; //{modelOfVehicle}
        String color;// {colorOfVehicle}
        int horsepower; //{horsepowerOfVehicle}

        public Truck(String type, String model, String color, int horsepower){
            //this.type = "Truck";
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }
        public String getType (){
            return type;
        }

        public String getModel(){
            return model;
        }

        public String getColor (){
            return color;
        }

        public int getHorsepower(){
            return horsepower;
        }

        public String toString (){
//            Type: Car
//            Model: Ferrari
//            Color: red
//            Horsepower: 550

            return String.format("Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %d",getType().toUpperCase().charAt(0) + this.getType().substring(1),this.getModel(),this.getColor(),this.getHorsepower());
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        String command = scan.nextLine();

        int countCars = 0;
        int countTrucks = 0;
        int horsepowerCars = 0;
        int horsepowerTrucks = 0;
        double averageCars = 0;
        double averageTrucks = 0;

        while (!command.equals("End")) {
            String[] commandline = command.split("\\s+");
            //{typeOfVehicle} {model} {color} {horsepower}
            switch (commandline[0]) {
                case "car":
                    Car car = new Car(commandline[0], commandline[1], commandline[2],
                            Integer.parseInt(commandline[3]));
                    cars.add(car);
                    countCars++;
                    horsepowerCars += Double.parseDouble(commandline[3]);
                    break;
                case "truck":
                    Truck truck = new Truck(commandline[0], commandline[1], commandline[2],
                            Integer.parseInt(commandline[3]));
                    trucks.add(truck);
                    countTrucks++;
                    horsepowerTrucks += Double.parseDouble(commandline[3]);
                    break;
            }
            command = scan.nextLine();
        }
        if (cars.isEmpty()){
            averageCars = 0.0;
        }else {
            averageCars = horsepowerCars * 1.0 / countCars;
        }

        if(trucks.isEmpty()){
            averageTrucks= 0.0;
        }else {
            averageTrucks = horsepowerTrucks * 1.0 / countTrucks;
        }


        command = scan.nextLine();
        while (!"Close the Catalogue".equals(command)) {
            String finalC = command;
            cars.stream()
                    .filter(v -> v.getModel().equals(finalC))
                    .forEach(System.out::println);
            trucks.stream()
                    .filter(v -> v.getModel().equals(finalC))
                    .forEach(System.out::println);

            command = scan.nextLine();
        }

        //"{typeOfVehicles} have average horsepower of {averageHorsepower}."
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTrucks);

    }
}
