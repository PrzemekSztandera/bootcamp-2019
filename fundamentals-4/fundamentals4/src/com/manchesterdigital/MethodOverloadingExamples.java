package com.manchesterdigital;

public class MethodOverloadingExamples {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int first, int second, int third) {
        return first * second * third;
    }

    public static void main(String[] args) {
        MethodOverloadingExamples me = new MethodOverloadingExamples();

        int result = me.multiply(4, 4);
        System.out.println(result);

        result = me.multiply(3, 3, 4);
        System.out.println(result);
    }
}
