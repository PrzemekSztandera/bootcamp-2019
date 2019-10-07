package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class RegConverter {

    public String convert(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("S", "5");
        map.put("A", "4");
        map.put("G", "9");
        map.put("B", "8");
        map.put("I", "1");


        if (!(input.matches("[a-zA-Z0-9]{5,7}"))) {
            throw new NullPointerException("Invalid input");
        }

        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(Character.toString(input.charAt(i)))) {
                stringBuilder.append(map.get(Character.toString(input.charAt(i))));
            } else {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        RegConverter regConverter = new RegConverter();

        System.out.println(regConverter.convert("FSDG32"));
        //System.out.println(regConverter.convert("FS32"));
    }
}
