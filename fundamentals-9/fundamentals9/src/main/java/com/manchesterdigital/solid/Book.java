package com.manchesterdigital.solid;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private Printer printer;

    public Book(Printer printer) {
        this.printer = printer;
    }

    public boolean isInIsbn(String sequence) {
        return isbn.contains(sequence);
    }

}
