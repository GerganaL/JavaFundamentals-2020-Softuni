package TextProcessingLection;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        String word = scan.nextLine();

        while(word.contains(key)){
            word= word.replace(key,"");
        }
        System.out.println(word);


    }
}
