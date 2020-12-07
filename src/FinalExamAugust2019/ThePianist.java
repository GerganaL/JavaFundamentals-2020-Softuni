package FinalExamAugust2019;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> pieceComposer = new TreeMap<>();
        Map<String,String> pieceKey = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            String [] information = input.split("\\|");
            String piece = information[0];
            String composer = information[1];
            String key = information[2];
            pieceComposer.putIfAbsent(piece,composer);
            pieceKey.putIfAbsent(piece,key);
        }

        String command = scan.nextLine();
        while (!command.equals("Stop")){
            String [] tokens = command.split("\\|");
            switch (tokens[0]){
                case "Add":
                    String pi = tokens[1];
                    String com = tokens[2];
                    String ke = tokens[3];
                    if(pieceComposer.containsKey(pi) && pieceKey.containsKey(pi)){
                        System.out.println(pi + " is already in the collection!");
                    }else{
                        pieceComposer.putIfAbsent(pi,com);
                        pieceKey.putIfAbsent(pi,ke);
                        System.out.println(pi + " by "+ com +" in "+ ke +" added to the collection!");
                    }
                    break;
                case "Remove":
                    String pie = tokens[1];
                    if(pieceComposer.containsKey(pie) && pieceKey.containsKey(pie)){
                        pieceComposer.remove(pie);
                        pieceKey.remove(pie);
                        System.out.println("Successfully removed "+ pie +"!");
                    }else{
                        System.out.println("Invalid operation! "+ pie +" does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String piece = tokens[1];
                    String newKey = tokens[2];
                    if(pieceKey.containsKey(piece)){
                        pieceKey.put(piece,newKey);
                        System.out.println("Changed the key of "+ piece+" to "+ newKey+"!");
                    }else{
                        System.out.println("Invalid operation! "+piece+" does not exist in the collection.");
                    }
                    break;
            }
            command = scan.nextLine();
        }

        pieceComposer.entrySet().stream()
                .forEach((entry)->
                        System.out.println(entry.getKey() + " -> Composer: " +
                               entry.getValue() + ", Key: " + pieceKey.get(entry.getKey())));
    }
}
