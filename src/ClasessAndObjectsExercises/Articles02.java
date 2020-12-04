package ClasessAndObjectsExercises;
import java.util.Scanner;

public class Articles02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] line = scan.nextLine().split(", ");

        Article article = new Article(line[0],line[1],line[2]);

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number ; i++) {
            line = scan.nextLine().split(": ");
            switch (line[0]){
                case "Edit":
                    article.setContent(line[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(line[1]);
                    break;
                case "Rename":
                    article.setTitle(line[1]);
                    break;
            }
        }
        System.out.println(article);
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setTitle(String title) {
            this.title = title;
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
        public String toString(){

            return String.format("%s - %s: %s%n", this.title, this.content, this.author);
        }
    }
}
