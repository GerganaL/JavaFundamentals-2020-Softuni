import java.util.Scanner;

public class ex1ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int counter = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }
            counter++;
            System.out.println();
        }
    }
}
