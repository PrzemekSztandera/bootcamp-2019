package com.manchesterdigital;

public class SwitchStatements {

    private static final int TEN_PENCE = 10;

    public static void main(String[] args) {
        int coinInserted  = 20;

        switch (coinInserted) {
            case TEN_PENCE:
            case 20:
                warningMessage();
                break;
            case 50:
                System.out.println("Inserted 50");
                break;
            default:
                System.out.println("No coin detected");
        }
        System.out.println("Change given???");
    }
    private static void warningMessage() {
        System.out.println("Not enough dollars");
    }
}
