package ClassesAndObjectLections;

import java.io.Console;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactoriel03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = "1";
        BigInteger factorial = new BigInteger(start);
        var n = Integer.parseInt(scan.nextLine());

        for (int i = 2 ; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));

        System.out.println(factorial);
    }
}
