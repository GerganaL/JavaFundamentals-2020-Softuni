package FinalExamApril1;

import java.util.Arrays;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String activationKey = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals("Generate")){
            String [] inputSplit = input.split(">>>");
            switch (inputSplit[0]){
                case "Contains":
                    String substring = inputSplit[1];
                    if(activationKey.contains(substring)){
                        //System.out.println(String.format("%s contains %s",activationKey,substring));
                        //System.out.println(activationKey + " contains " + substring);
                        System.out.printf("%s contains %s%n",activationKey,substring);
                    }else {
                       // System.out.println(String.format("Substring not found!"));
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                   String command = inputSplit[1];
                   int startIndex = Integer.parseInt(inputSplit[2]);
                   int endIndex = Integer.parseInt(inputSplit[3]);
                   String toChange = activationKey.substring(startIndex,endIndex);
                   if(command.equals("Upper")){
                      toChange = toChange.toUpperCase();
                      StringBuilder sb = new StringBuilder();
                      sb.append(activationKey);
                      sb.replace(startIndex,endIndex,toChange);
                      activationKey = sb.toString();
                   }else {
                       toChange = toChange.toLowerCase();
                       StringBuilder sb = new StringBuilder();
                       sb.append(activationKey);
                       sb.replace(startIndex,endIndex,toChange);
                       activationKey = sb.toString();
                   }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                     startIndex = Integer.parseInt(inputSplit[1]);
                     endIndex = Integer.parseInt(inputSplit[2]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(activationKey);
                    sb.replace(startIndex,endIndex,"");
                    activationKey = sb.toString();
                    System.out.println(activationKey);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.printf("Your activation key is: %s",activationKey);
    }
}
