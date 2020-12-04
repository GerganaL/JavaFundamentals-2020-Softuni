package MoreExMethods;

import java.util.Scanner;

public class dataTypes01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        String n = scan.nextLine();

        getType(type,n);
    }

    static void getType (String type, String n) {
        switch (type){
            case "int":
                int number = Integer.parseInt(n);
                System.out.println(number*2);
                break;
            case "real":
                double num = Double.parseDouble(n);
                System.out.printf("%.2f",num * 1.5);
                break;
            case "string":
                System.out.printf("$%s$",n);
                break;
        }
    }
}
