package com.manchesterdigital;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapProcessorTest {

    @Test
    public void whenOnlyAKeyIsPresentShouldReturnOriginalMap() {
        // arrange
        MapProcessor mapProcessor = new MapProcessor();
        Map<String, String> mapWithA = new HashMap<>();
        mapWithA.put("a", "Hello");
        // act
        Map<String, String> result = mapProcessor.mapAB(mapWithA);

        //
        assertThat(result).isEqualTo(mapWithA);
    }

    @Test
    public void whenBothAandBKeyIsPresentShouldReturnChangedMap() {
        // arrange
        MapProcessor mapProcessor = new MapProcessor();
        Map<String, String> mapWithAB = new HashMap<>();
        mapWithAB.put("a", "Hello");
        mapWithAB.put("b", "World");
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "Hello");
        expectedMap.put("ab", "HelloWorld");
        expectedMap.put("b", "World");
        // act
        Map<String, String> result = mapProcessor.mapAB(mapWithAB);

        // assert
        assertThat(result).isEqualTo(expectedMap);
    }


}
