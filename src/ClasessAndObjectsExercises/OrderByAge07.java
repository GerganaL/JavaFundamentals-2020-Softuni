package ClasessAndObjectsExercises;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String input = scan.nextLine();
        while(!input.equals("End")){
        String[] tokens = input.split("\\s+");
        Person person = new Person(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
        personList.add(person);
        input = scan.nextLine();
        }

        personList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }

   static class Person {
        String name;
        String ID;
        int age;

       public  Person(String name, String ID, int age){
            this.name = name;
            this.ID = ID;
            this.age = age;
       }

       public String getName() {
           return name;
       }

       public String getID() {
           return ID;
       }

       public int getAge() {
           return age;
       }

       public String toString (){
           //Stefan with ID: 524244 is 10 years old.
           return String.format("%s with ID: %s is %d years old.",getName(),getID(),getAge());
       }
   }

}
