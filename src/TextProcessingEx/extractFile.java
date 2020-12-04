package TextProcessingEx;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String path = scan.nextLine();

        String nameAndExtension = path.substring(path.lastIndexOf("\\") + 1);
        String name = nameAndExtension.substring(0,nameAndExtension.lastIndexOf("."));
        String extension = nameAndExtension.substring(nameAndExtension.lastIndexOf(".") + 1);


        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
