package com.manchesterdigital;


import org.apache.commons.collections.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Arena {
    public static void main(String[] args) {
        Artist arianaGrande = new Artist("Ariana Grande",
                List.of(new Members("Ariana Grande")),
                "London");

        Artist beatels = new Artist("Beatels",
                List.of(new Members("John Lennon"),
                        new Members("Paul McCartney"),
                        new Members("Ringo Star"),
                        new Members("George Harrison")),
                "Liverpool");

        Artist coldplay = new Artist("Coldplay",
                List.of(new Members("Chris Martin"),
                        new Members("Guy Barryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")),
                "London");

        List<Artist> artists = List.of(arianaGrande, beatels, coldplay);
        long countFromLiverpool = 0;

        for(Artist artist : artists) {
            if(artist.isFrom("Liverpool")) {
                countFromLiverpool++;
            }
        }
        System.out.println("countFromLiverpool = " + countFromLiverpool);

        var numberOfArtistFromLiverpool = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count();
        System.out.println("liverpool = " + numberOfArtistFromLiverpool);


        // gathering match criteria
        var london = artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .collect(Collectors.toList());
        System.out.println("london = " + london);

        london.stream().map(Artist::getName).forEach(System.out::println);

        List<Members> artistMembers = artists.stream()
                .map(Artist::getMembersList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("artistMembers = " + artistMembers);

        // sorting
        /*
        Collections.sort(artists, new Comparator<Artist>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
         */

        // better to do this
        Set<Artist> uniqueArtist = new HashSet<>(artists);
        uniqueArtist.stream()
                .sorted(Comparator.comparing(artist -> artist.getName()))
                .forEach(System.out::println);

        //Collections.sort(artists, Comparator.comparing(Artist::getName));
        var build = Artist.builder().album("lol").location("fds").build();
        System.out.println("From lombok builder = " + build);

    }
}
