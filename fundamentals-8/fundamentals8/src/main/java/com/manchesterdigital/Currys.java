package com.manchesterdigital;

public class Currys {

    public static void putOnStandBy(StandBy standBy) {
        standBy.standByMode();
    }

    public static void main(String[] args) {
        TV tv = new TV();
        Fridge fridge = new Fridge();

        putOnStandBy(tv);
        putOnStandBy(fridge);
    }
}
