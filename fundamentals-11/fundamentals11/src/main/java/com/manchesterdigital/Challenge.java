package com.manchesterdigital;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Challenge {

    public static void main(String[] args) {
        Calculator calculator = (n,m) -> n * m;
        System.out.println(calculator.calculate(3, 9));

        BiFunction<Integer, Integer, Integer> function = (n, m) -> n * m;
        System.out.println(function.apply(4, 9));

        // Divide a number by another number
        Divider divider = ((a, b) -> a / b);
        var aDouble = divider.divideIt(6d, 3d);
        System.out.println("aDouble = " + aDouble);

        // this will fail
        var aDouble2 = divider.divideIt(6d, 0d);

        Divider safeDivider = (a, b) -> {
            if(b == 0) {
                return 0d;
            }
            return a / b;
        };

        Divider safeDivider2 = (a, b) -> b == 0 ? b : a / b;
    }
}
