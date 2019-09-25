package com.manchesterdigital;

public class Dog {

    public static final int NUMBER_OF_TEETH = 34;
    private int sizeOfDog;

    public Dog(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog;
    }

    public String bark() {
        if(sizeOfDog > 60) {
            return "WOOF!";
        } else if (sizeOfDog > 15) {
            return "RUFF!";
        }
        return "YIP!";
    }

    public static void relieve() {
        System.out.println("Gone for dump...");

    }

}
