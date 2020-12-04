package MoreExDataTypesAndVariables;

import java.util.Scanner;

public class BalancedBrackets06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scan.nextLine());
        int openingCount = 0;
        int closingCount = 0;
        for (int i = 0; i <numberOfLines ; i++) {
            String line = scan.nextLine();
            if (line.equals("(") ){
                openingCount++;
            }
            if (line.equals(")")){
                closingCount++;
            }
            if (closingCount>openingCount ){
                System.out.println("UNBALANCED");
                return;
            }
        }

        if (closingCount == openingCount){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }

    }
}
