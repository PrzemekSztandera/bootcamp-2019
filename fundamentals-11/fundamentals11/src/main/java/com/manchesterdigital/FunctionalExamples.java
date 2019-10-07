package com.manchesterdigital;

import java.util.List;
import java.util.function.Function;

public class FunctionalExamples {
    public static void main(String[] args) {
        // 1st calculate total price of all items
        // 2st multiply sales by tax...
        // 3rs add sales to total
        // 4th return total

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("i = " + i);
        }
        System.out.println("-----------");
        // moved on 2000s ...
        for(Integer i : numbers) {
            System.out.println("i = " + i);
        }

        // Lambda
        /**
         * ( A list of parameters separated by commas ) -> { expression body which contains one or more statements }
         */
        System.out.println("------------------");
        NumericTest isEven = (n) -> (n % 2 == 0);
        System.out.println(
                "Is 4 an even number? " + isEven.computeTest(4)
        );

        System.out.println(
                "Is 5 an even number? " + isEven.computeTest(5)
        );

        NumericTest isNegative = (n) -> (n < 0);

        System.out.println(
                "-1 is negative? " + isNegative.computeTest(-1)
        );

        NumericTest isOdd = (n) -> false;

        Greeting greetInSpanish = () -> System.out.println("Hola");

        greetInSpanish.message();

        Function<String, Integer> getWordLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Integer helloLength = getWordLength.apply("Hello");
        System.out.println("Length of word hello = " + helloLength);

        Function<String, Integer> getWordLengthModernised = String::length;
        System.out.println(getWordLengthModernised.apply("Amy"));

        Function<Artist, String> extractArtistName = Artist::getName;

        Function<String, String> convertToUpper = String::toUpperCase;

        var skepta = new Artist("Skepta", 2_000_000L);
        System.out.println(extractArtistName.andThen(convertToUpper).apply(skepta));


        Function<Integer, Double> half = a -> a / 2.0d;
        half = half.compose(a -> a * 3);
        System.out.println("half.apply(5) = " + half.apply(5));

        half = half.andThen(a -> a * 3);
        System.out.println("half.apply(10) = " + half.apply(10));
    }
}
