package com.manchesterdigital.bookchallenge;

public class Isbn {

    public static String calculateCheckDigit(String validISBN) {
        return null;
    }

    public boolean validateIsbn13(String isbn) {
        boolean result = false;
        String digitsOnly = isbn;
        if (!(Character.toString(isbn.charAt(isbn.length() - 1)).matches("[0-9]")) ||
                (isbn.matches("(.*-.*)") && isbn.matches("(.* .*)"))) {
            throw new InvalidIsbnException("Invalid ISBN provided");
        }
        if (isbn.matches("(.*-.*|.* .*)")) {
            digitsOnly = isbn.replaceAll("(-+| +)", "");
        }

        if (digitsOnly.matches("^[0-9]") || digitsOnly.length() != 13) {
            throw new InvalidIsbnException("Invalid ISBN provided");
        }
        System.out.println(digitsOnly);
        return result;
}

    public static void main(String[] args) {
        Isbn isbn = new Isbn();
        isbn.validateIsbn13("978 0 13 149 505 0");
        isbn.validateIsbn13("978-0-13-149505-0");
    }
}
