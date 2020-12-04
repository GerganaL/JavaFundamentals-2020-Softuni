package ClassesAndObjectLections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < num ; i++) {
            String line = scan.nextLine();
            String [] tokens = line.split("_");

            Song song = new Song(tokens[0],tokens[1],tokens[2]);
            songs.add(song);
        }
        String typeList = scan.nextLine();


        if(typeList.equals("all")){
            for(Song song : songs){
                System.out.println(song.getName());
            }
        }else{
            for (Song song : songs){
                if(song.getType().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }

//        List<Song> filterSong = songs.stream().filter(e -> e.getType().equals(type))
//                .collect(Collectors.toList());
//        for (Song song : filterSong){
//            System.out.println(song.getName());
//        }

    }
    static void checkType (List<Song> songs, String type){
        if(type.equals("all")){
            for(Song song : songs){
                System.out.println(song.getName());
            }
        }else{
            for (Song song : songs){
                if(song.getType().equals(type)){
                    System.out.println(song.getName());
                }
            }
        }
    }

    static class Song {
        String type;
        String name;
        String time;


        public Song(String type,String name, String time){
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

    }
}
