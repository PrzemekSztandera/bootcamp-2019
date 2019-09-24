package com.manchesterdigital;

import java.util.Arrays;
import java.util.stream.Stream;

public class CodeWars {

    public static void main(String[] args) {
        points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});
    }

    public static int points(String[] games) {

        Stream<String[]> subGames = Stream.of(games)
                .map(arr -> arr.split(""));


       //int[] points = subGames.filter(arr -> s.matches("[0-9]"));
        System.out.println(subGames);
        return 0;
    }
}
