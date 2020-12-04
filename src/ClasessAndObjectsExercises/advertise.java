package ClasessAndObjectsExercises;

import java.util.Random;
import java.util.Scanner;

public class advertise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        Advertise mess = new Advertise();

        for (int i = 0; i < number ; i++) {
            System.out.println(mess.randomMess());
        }


    }


    static class Advertise {
        String [] phrases =  {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String [] events =  {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String [] authors = {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"} ;
        String [] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"} ;

      Random random = new Random();

      public String randomMess () {

          return String.format("%s %s %s - %s",phrases[random.nextInt(phrases.length)],
          events[random.nextInt(events.length)],authors[random.nextInt(authors.length)],
                  cities[random.nextInt(cities.length)]);

      }


    }
}
