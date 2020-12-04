package ClasessAndObjectsExercises;

import java.util.*;
import java.util.stream.Collectors;

public class opinionPoll03 {
    public static <People> void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nLines = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();


        for (int i = 0; i < nLines; i++) {
            String[] line = scan.nextLine().split(" ");
            Person person = new Person(line[0], Integer.parseInt(line[1]));
            //if (person.age >= 30) {
                personList.add(person);

            //}
        }

        //Comparator<Person>namesComparator = Comparator.comparing(Person::getName);

        personList.stream().sorted(Comparator.comparing(Person::getName)).filter(age -> age.getAge() >= 30).forEach(System.out::println);

       // personList.stream().sorted(namesComparator).filter(age -> age.getAge() >= 30).forEach(System.out::println);



    }


    static class Person {
        String name;
        int age;

        public boolean over30() {
            return this.age >= 30;
        }
        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return  name + " - " + age ;
        }
    }

}
