package AssociativeArrayEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            int res = Integer.parseInt(scan.nextLine());
            if(!resources.containsKey(command)){
                resources.put(command,res);
            }else {
                int value = resources.get(command);
                resources.put(command,value+res);
            }
            command = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
