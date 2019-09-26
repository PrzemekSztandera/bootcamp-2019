package com.manchesterdigital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsExample {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = null;

        fis = new FileInputStream("/file.txt");
    }
}
