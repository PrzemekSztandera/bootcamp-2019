package com.manchesterdigital;

public class Challenge3 {

    static void print(String message, int age) {
        if(age > 60) {
            System.out.println(message);
            System.out.println(message);
        } else {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        print("Hi", 78);
    }
}
