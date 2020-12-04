package Homework;

import java.util.Scanner;

public class ex1ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (0 <= age && age <= 2) {
            System.out.println("baby");
        }else if(3 <= age && age <= 13) {
            System.out.println("child");
        }   else if(13 < age && age <=19){
            System.out.println("teenager");
        }else if(19 < age && age <=65){
            System.out.println("adult");
        }else if (age>=66){
            System.out.println("elder");
        }
    }
}


