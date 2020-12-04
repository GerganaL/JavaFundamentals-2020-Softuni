package ClasessAndObjectsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class AdvertisementMessage01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String [] phrases = new String[] {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String [] events = new String[] {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String [] authors = new String[] {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"} ;
        String [] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"} ;


        Random random = new Random();

        for (int i = 0; i < number ; i++) {
            int PhraseIndex = random.nextInt(phrases.length);
            int EventIndex = random.nextInt(events.length);
            int AuthorIndex = random.nextInt(authors.length);
            int CityIndex = random.nextInt(cities.length);

            System.out.println(phrases[PhraseIndex] + " " + events[EventIndex] + " "
            + authors[AuthorIndex] +" " + cities[CityIndex]);
        }

    }




}
