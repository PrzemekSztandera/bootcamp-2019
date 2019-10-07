package com.manchesterdigital;

import java.util.*;

public class Scratch {
    public static void main(String[] args) {
        var adele = new Artist("Adele", 9_000_000L);
        var prince = new Artist("Prince", 20_000_000L);
        List<Artist> artists = Arrays.asList(adele, prince);

        artists.forEach(artist -> System.out.println("artist = " + artist));
        artists.forEach(System.out::println);

        for (Artist artist: artists) {
            System.out.println("artist = " + artist);
        }

        Map<Long, Artist> artistMap = new HashMap<>();
        artistMap.put(1L, adele);
        artistMap.put(2L, prince);
        System.out.println("----------------");
        for (Map.Entry<Long, Artist> me : artistMap.entrySet()) {
            System.out.println("me = " + me);
        }
        System.out.println("-----------------");
        for (Long key : artistMap.keySet()) {
            System.out.println("key = " + key);
            if (artistMap.containsKey(key)) {
                System.out.println("key = " + key + " exists");
            }
        }
        System.out.println("------------------");
        for (Artist artist : artistMap.values()) {
            System.out.println("artist = " + artist);
        }

        System.out.println("------------------");

        Set<Artist> artistSet = new HashSet<>(artistMap.values());
        for (Artist artist : artistSet) {
            System.out.println("Uniqe artists = " + artist);
        }

        // Immutability ....
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Set<Long> distances = Set.of(1L, 2L, 3L, 4L);

        var longStringMap = Map.of(1L, "John", 2L, "April");
        //longStringMap.put(3L, "Hannah");

        for (Map.Entry me : longStringMap.entrySet()) {
            System.out.println("me = " + me);
        }
    }
}
