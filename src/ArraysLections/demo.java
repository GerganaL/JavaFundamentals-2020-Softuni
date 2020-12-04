package ArraysLections;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] daysOfTheWeek  = new String[] {"Monday", "Tuesday","Wednesday", "Thursday","Friday",
                "Saturday","Sunday"};

        int day = scan.nextInt();
        if (1<=day && day<=7){
        System.out.println(daysOfTheWeek[day-1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
