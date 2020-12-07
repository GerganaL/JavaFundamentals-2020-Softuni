package FinalExamAugust2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       StringBuilder allStops = new StringBuilder(scan.nextLine());
        String commands = scan.nextLine();

        while (!commands.equals("Travel")){
            String [] tokens = commands.split(":");
            String command = tokens[0];
            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String strToInsert = tokens[2];
                    if(isValid(allStops,index)) {
                        allStops.insert(index, strToInsert);
                    }

                    break;
                case "Remove Stop":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    if (isValid(allStops,start) && isValid(allStops,end)){
                    allStops.replace(start, end + 1, "");
                }

                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    if (allStops.toString().contains(oldString)) {
                        allStops = new StringBuilder(allStops.toString().replace(oldString, newString));
                    }
                    break;
            }
            System.out.println(allStops);
            commands = scan.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + allStops);
    }
    static  boolean  isValid (StringBuilder str, int index){
        if(index >=0 && index < str.length()){
            return true;
        }
        return false;
    }
}
