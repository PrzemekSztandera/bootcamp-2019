package com.manchesterdigital.bookchallenge;

public class ArrayComparator {


    private static char findMissingLetter(char[] referenceArray) {
        char missingLetter = 0;
        for (int i =0; i < referenceArray.length; i++) {
            if(referenceArray[i + 1] - referenceArray[i] > 1) {
                missingLetter = (char) (referenceArray[i] + 1);
                break;
            }
        }
        return missingLetter;
    }

    public static void main(String[] args) {

        char[] array = {'e','f','h','i'};

        System.out.println(findMissingLetter(array));

        char num = 'A' + 'B' + 34838;
        int some = 'f';
        System.out.println(num);
        System.out.println(some);
    }
}
