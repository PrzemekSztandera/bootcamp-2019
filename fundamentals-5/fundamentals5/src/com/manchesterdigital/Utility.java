package com.manchesterdigital;

import java.sql.Struct;
import java.util.InputMismatchException;

public class Utility {
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    static boolean isNamesMatch(String firstName, String secondName) {
        return firstName.equalsIgnoreCase(secondName);
    }

    /**
     * Converts a string to a long.
     *
     * @param input the input received.
     * @return a long if successful.
     * @throws NumberFormatException if input is not a number and outside long's limit.
     */
    public static Long convertStringToLong(String input) throws NumberFormatException {
        return new Long(input);
    }
}
