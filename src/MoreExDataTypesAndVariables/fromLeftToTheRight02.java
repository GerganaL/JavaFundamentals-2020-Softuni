package MoreExDataTypesAndVariables;

import java.util.Scanner;

public class fromLeftToTheRight02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < lines; i++) {

            double num1 = Double.parseDouble(scan.next());
            double num2 = Double.parseDouble(scan.next());
            int sum = 0;

            if (num2 > num1) {
                double number2 = Math.abs(num2);
                while (number2 > 0) {
                    sum += number2 % 10;
                    number2 /= 10;
                }
                System.out.println(Math.abs(sum));
            }else {
                double number1 = Math.abs(num1);
                while(number1>0){
                    sum+=number1%10;
                    number1/=10;
                }
                System.out.println(Math.abs(sum));
            }
        }
    }
}
