package AssociativeArrayEx;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademyShort07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, ArrayList<Double>> studentsGrade = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {
            String studentName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            studentsGrade.putIfAbsent(studentName,new ArrayList<>());
            studentsGrade.get(studentName).add(grade);
        }

        studentsGrade.entrySet()
                .stream()
                .sorted((f,s) -> Double.compare(averageCalc(s),averageCalc(f)))
                .filter(f -> averageCalc(f) >= 4.50)
                .forEach(e -> System.out.printf("%s -> %.2f%n",e.getKey(),averageCalc(e)));
    }
    private static double averageCalc(Map.Entry<String, ArrayList<Double>> s) {
        return s.getValue().stream().mapToDouble(i -> i).average().getAsDouble();
    }
}
