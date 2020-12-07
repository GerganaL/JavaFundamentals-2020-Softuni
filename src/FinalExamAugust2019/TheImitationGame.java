package FinalExamAugust2019;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String encryptedMessage = scan.nextLine();

        String commands = scan.nextLine();
        while (!commands.equals("Decode")){
        String [] tokens = commands.split("\\|");
            switch (tokens[0]){
                case "Move":
                    int n = Integer.parseInt(tokens[1]);
                    String sub = encryptedMessage.substring(0,n);
                    encryptedMessage = encryptedMessage.replace(sub,"");
                    encryptedMessage += sub;
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    StringBuilder sb = new StringBuilder();
                    sb.append(encryptedMessage);
                    sb.insert(index,value);
                    encryptedMessage = sb.toString();
                    break;
                case "ChangeAll":
                    String subStr = tokens[1];
                    String replacement = tokens[2];
                    encryptedMessage = encryptedMessage.replace(subStr,replacement);
                    break;

            }
            commands = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + encryptedMessage);
    }
}
