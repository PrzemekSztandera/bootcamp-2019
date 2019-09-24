package com.manchesterdigital;


public class Challenge2 {

    private static String registrationGenerator(String input) {
        String[] inputAsArr = input.split("");
        StringBuilder stringBuilder = new StringBuilder("");

        stringBuilder.append(changeLetterToNumber(inputAsArr[0]))
                        .append(changeLetterToNumber(inputAsArr[1]))
                        .append(changeLetterToNumber(inputAsArr[2]))
                        .append(changeLetterToNumber(inputAsArr[3]))
                        .append(changeLetterToNumber(inputAsArr[4]))
                        .append(changeLetterToNumber(inputAsArr[5]))
                        .append(changeLetterToNumber(inputAsArr[6]));

        return stringBuilder.toString();
    }

    private static String changeLetterToNumber(String letter) {
        switch (letter) {
            case "S":
                return "5";
            case "A":
                return "4";
            case "I":
                return "1";
            case "B":
                return "8";
            case "G":
                return "9";
            default:
                return letter;
        }
    }

    public static void main(String[] args) {
        System.out.println(registrationGenerator("7497943"));
    }
}
