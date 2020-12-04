package Homework;

import java.util.Scanner;

public class Lab02ContactNames05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String lastName = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.printf("%s%s%s",name,delimiter,lastName);
    }
}
