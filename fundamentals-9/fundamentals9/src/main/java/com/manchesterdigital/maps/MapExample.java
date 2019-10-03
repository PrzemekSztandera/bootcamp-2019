package com.manchesterdigital.maps;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("enGB", "England");
        countries.put("esES", "Spain");
        countries.put("ptPt", "Portugal");

        String key = "ptPt";

        var s = countries.get(key);
        System.out.println("Country: " + s);

        countries.put(key, "Duncan");

        s = countries.get(key);
        System.out.println(s);

        Set set = countries.entrySet();

        for (Object object : set) {
            System.out.println(object);
        }

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Andrew");

        // removes item by key:
        var remove = names.remove(2);
        System.out.println(remove);

        var remove1 = names.remove(2);
        System.out.println(remove1);

        System.out.println("number of items in map = " + names.size());

        names.put(1, "April");
        names.put(2, "Sania");
        names.put(3, "Schmek");

        for (Map.Entry<Integer, String> me : names.entrySet()) {
            System.out.println(me);
        }



        Map<String, String> someMap = new HashMap<>();
        System.out.println("someMap.get(\"lol\") = " + someMap.get("lol"));



        for (Integer mapKey :names.keySet()) {
            System.out.println("mapKey = " + mapKey);
        }

        for (String mapValue :names.values()) {
            System.out.println("mapValue = " + mapValue);
        }

    }
}
