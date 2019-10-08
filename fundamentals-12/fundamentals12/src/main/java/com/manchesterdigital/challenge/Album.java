package com.manchesterdigital.challenge;

import java.util.List;
import java.util.stream.Stream;

public class Album {
    private static List<String> albums = List.of("Kirk",
            "Hollywood's Bleeding",
            "Abbey Road",
            "Lover",
            "Astroworld",
            "Free Spirit",
            "Scorpion",
            "American Teen",
            "1",
            "Death Race for Love",
            "Welcome Home",
            "Traveller",
            "Alladin");

    public static void main(String[] args) {
        albums.stream().filter(album -> album.startsWith("A")).forEach(System.out::println);

        // returns eg. stream of Lists not what is inside of List
        Stream<List<String>> stream =  Stream.of(albums);
        //stream.filter(album -> album.startsWith("A")).forEach(System.out::println);

        String result = Stream.of("a", "b", "c")
                .filter(s -> s.equalsIgnoreCase("g"))
                .findAny()
                .orElse("c");
        System.out.println("result = " + result);


    }
}
