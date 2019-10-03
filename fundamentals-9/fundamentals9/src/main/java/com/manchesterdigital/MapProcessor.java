package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapProcessor {
    public Map<String, String> mapAB(Map<String, String> map) {
        Map<String, String> processedMap;

        if(map.containsKey("a") && map.containsKey("b")) {
            processedMap = new HashMap<>();
            processedMap.putAll(map);
            processedMap.put("ab", map.get("a")+ map.get("b"));
        } else {
            processedMap = map;
        }

        return processedMap;
    }
}
