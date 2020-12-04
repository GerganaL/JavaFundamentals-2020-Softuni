package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = scan.nextInt();

        int [] firstArr = new int[index];
        int [] secondArr = new int[index];

        for (int i = 0; i <index ; i++) {
            if(i%2 == 0){
                firstArr[i]=Integer.parseInt(scan.next());
                secondArr[i]=Integer.parseInt(scan.next());
            }else{
                secondArr[i]=Integer.parseInt(scan.next());
                firstArr[i]=Integer.parseInt(scan.next());
            }
        }
        for(int number : firstArr){
            System.out.print(number + " ");
        }
        System.out.println();
        for(int number: secondArr ){
            System.out.print(number + " ");
        }
    }
}
