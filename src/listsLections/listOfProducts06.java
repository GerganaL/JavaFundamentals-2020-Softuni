package listsLections;

import java.util.*;

public class listOfProducts06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> listOfProduct = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String product = scan.nextLine();
            listOfProduct.add(product);
        }
        Collections.sort(listOfProduct);
        for (int i = 0; i < listOfProduct.size() ; i++) {
            System.out.printf("%d.%s%n",i+1 , listOfProduct.get(i));
        }
    }
}
