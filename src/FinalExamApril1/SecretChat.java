package FinalExamApril1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        String commands = scan.nextLine();
        while (!commands.equals("Reveal")){
            String [] tokens = commands.split(":\\|:");
            switch (tokens[0]){
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    StringBuilder sbMessage = new StringBuilder();
                   // sbMessage.setLength(0);
                    sbMessage.append(message);
                    sbMessage.insert(index," ");
                    message = sbMessage.toString();
                    System.out.println(message);
                    break;
                case "Reverse":
                    String subs = tokens[1];
                    if(message.contains(subs)){
                      /* String forReplace = new StringBuilder(subs).reverse().toString();
                       message = message.replaceFirst(Pattern.quote(subs),"") + forReplace;*/
                        StringBuilder sb = new StringBuilder();
                        sb.append(subs).reverse();
                        int startIndex = message.indexOf(subs);
                        int endIndex = startIndex + subs.length();
                        StringBuilder toReplace = new StringBuilder();
                        toReplace.append(message);
                        toReplace.replace(startIndex,endIndex,"");
                        // message = message.replaceFirst(subs,"");
                       message = toReplace.toString();
                       message = message + sb;
                        System.out.println(message);
                    }else {
                        System.out.println("error");

                    }                    break;
                case "ChangeAll":
                    String subStr = tokens[1];
                    String replacement = tokens[2];
                   message = message.replace(subStr,replacement);
                    System.out.println(message);
                    break;

            }
            commands = scan.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);

    }
}
