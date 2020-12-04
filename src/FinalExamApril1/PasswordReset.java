package FinalExamApril1;

import java.util.Scanner;

public class PasswordReset {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        String command = scan.nextLine();
        while (!command.equals("Done")){
            String [] tokens = command.split(" ");
            String comand = tokens[0];
            switch (comand){
                case "TakeOdd":
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i <password.length() ; i+=2) {
                        sb.append(password.charAt(i));
                    }
                    password = sb.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String toRemove = password.substring(index,index+length);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(password);
                    stringBuilder.replace(index,index+length,"");
                    password  = stringBuilder.toString();
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String subtitute = tokens[2];
                    String temporary = "";
                    if(password.contains(substring)){
                        temporary = password.replaceAll(substring,subtitute);
                        password = temporary;
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            command = scan.nextLine();
        }
        System.out.println("Your password is: "+ password);
    }
}
