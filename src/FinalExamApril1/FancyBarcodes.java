package FinalExamApril1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        String digitRegex = ("\\d");
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String barcode = scan.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()){
                Pattern pattern1 = Pattern.compile(digitRegex);
                Matcher matcher1 = pattern1.matcher(barcode);
                StringBuilder sb = new StringBuilder();
                while (matcher1.find()){
                    sb.append(matcher1.group(0));
                }
                if (sb.toString().isEmpty()){
                    System.out.println("Product group: 00");
                }else{
                    System.out.println("Product group: "+ sb.toString());
                }
            }else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
