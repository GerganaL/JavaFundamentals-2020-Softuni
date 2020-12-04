package ClasessAndObjectsExercises;

import java.util.*;

public class article204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Article2> art = new ArrayList<>();
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String[] line = scan.nextLine().split(", ");
            String title = line[0];
            String content = line[1];
            String author = line[2];

            Article2 article = new Article2(title, content, author);
            art.add(article);
        }
        String command = scan.nextLine();
        switch (command) {
            case "title":
                //art.sort(Comparator.comparing(Article2::getTitle));
                //System.out.println(art.toString().replaceAll("[\\[\\],]", ""));
                art.stream().sorted(Comparator.comparing(Article2::getTitle)).forEach(System.out::print);
                break;
            case "content":
                //art.sort(Comparator.comparing(Article2::getContent));
                //System.out.println(art.toString().replaceAll("[\\[\\],]", ""));
                art.stream().sorted(Comparator.comparing(Article2::getContent)).forEach(System.out::print);
                break;
            case "author":
                //art.sort(Comparator.comparing(Article2::getAuthor));
                // System.out.println(art.toString().replaceAll("[\\[\\],]", ""));
                art.stream().sorted(Comparator.comparing(Article2::getAuthor)).forEach(System.out::print);
                break;
        }
    }
}


class Article2 {
    String title;
    String content;
    String author;

    public Article2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        return String.format("%s - %s: %s%n", this.title, this.content, this.author);
    }
}

