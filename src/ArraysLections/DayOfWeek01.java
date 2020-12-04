package ArraysLections;

import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String [] dayOfTheWeek = new String [] {"Monday", "Tuesday" , "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"};
        int n = scan.nextInt();
        if (1<= n && n <= 7){
            System.out.println(dayOfTheWeek[n-1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
