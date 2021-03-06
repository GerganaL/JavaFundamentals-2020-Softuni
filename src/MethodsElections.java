import java.util.*;

class Main {
    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new LinkedHashMap<>();

        stringIntegerMap.put("hotel", 5);
        stringIntegerMap.put("bravo", 5);
        stringIntegerMap.put("siera", 3);

        stringIntegerMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey (),entry.getValue ()));
    }

    static List<Integer> parseLineOfNumbers (Scanner scanner){
        String line = scanner.nextLine();
        String [] numbersAsString = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsString){
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;

    }

}
