package Homework;

import java.util.Scanner;

public class ex1ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = "";
        for (int i = username.length()-1; i >= 0; i--) {
            password+=username.charAt(i);
        }
        int counter = 0;
        while (counter<4){
            String input = scan.nextLine();
            if(input.equals(password)){
                System.out.printf("User %s logged in.",username);
                return; // прекратява изпълнението на програмата
            }else if (counter<3){
                System.out.printf("Incorrect password. Try again!%n");
            }
            counter++;

        }
        if (counter==4){
            System.out.printf("User %s blocked!",username);
        }



//        String origanal, username = "";
//        Scanner in = new Scanner(System.in);
//
//        origanal = in.nextLine();
//        int length = origanal.length();
//        for (int i = length - 1; i >= 0; i--) {
//            username = username + origanal.charAt(i);
//        }
//        String password = in.nextLine();
//        int count = 1;
//
//        while (!password.equals(username)) {
//            System.out.println("Incorrect password. Try again.");
//            count++;
//            password = in.nextLine();
//            if (password.equals(username)) {
//                System.out.println("User " + origanal + " logged in.");
//            } else if (count == 4) {
//                System.out.println("User " + origanal + " blocked!");
//                break;
//            }
//
//        }
    }

    }


