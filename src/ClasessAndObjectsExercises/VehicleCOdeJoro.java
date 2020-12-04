package ClasessAndObjectsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCOdeJoro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Vehicle> vehiclesList=new ArrayList<>();
        String input;
        while (!"End".equals(input=scan.nextLine())){
            String[]data=input.split(" ");
            Vehicle addData=new Vehicle(data[0],data[1],data[2],Integer.parseInt(data[3]));
            vehiclesList.add(addData);
        }
        while (!"Close the Catalogue".equals(input=scan.nextLine())){
            String finalInput = input;
            vehiclesList.stream().filter(data->data.getModel().equals(finalInput)).forEach(data->System.out.println(data.output()));
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",averageHorsepower(vehiclesList)[0]);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageHorsepower(vehiclesList)[1]);
    }

    private static Double[] averageHorsepower(List<Vehicle> vehiclesList) {
        double sumCar=0.0; double sumTruck=0.0; int countCar=0; int countTruck=0;
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getType().equals("car")) {
                sumCar += vehicle.getHorsepower();
                countCar++;
            } else {
                sumTruck += vehicle.getHorsepower();
                countTruck++;
            }
        }
        if(sumCar!=0.0){ sumCar=sumCar / countCar;
        }
        if(sumTruck!=0.0){ sumTruck=sumTruck/countTruck;
        }
        return new Double[]{sumCar,sumTruck};
    }

    static class Vehicle{

        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() { return type; }

        public String getModel() {return model; }

        public String getColor() { return color;}

        public int getHorsepower() { return horsepower; }

        public String output(){
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getType().toUpperCase().charAt(0)+getType().substring(1),getModel(),getColor(),getHorsepower());
        }
    }

}
