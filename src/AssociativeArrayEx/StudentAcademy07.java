package AssociativeArrayEx;

import java.util.*;

public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        students.entrySet()
                .stream()
                .filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
                .sorted((f, s) -> {
                    double firstAv = f.getValue().stream()
                            .mapToDouble(e -> Double.parseDouble(String.valueOf(e)))
                            .average()
                            .getAsDouble();

                    double secondAv = s.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    return Double.compare(secondAv, firstAv);

                })
                .forEach(s -> {
                    System.out.printf("%s -> %.2f%n", s.getKey()
                            , s.getValue().stream()
                                    .mapToDouble(Double::doubleValue).average()
                                    .getAsDouble());

                });
    }
}
