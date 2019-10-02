package com.manchesterdigital;

public enum DogSize {
    SMALL("meow"),
    MEDIUM("ruff"),
    LARGE("woof");

    private String noise;

    DogSize(String noise) {
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }
}
