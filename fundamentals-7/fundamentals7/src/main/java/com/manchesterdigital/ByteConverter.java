package com.manchesterdigital;

public class ByteConverter {
    public static String convert(int number) {
        int MB = number/1024;
        int KB = number%1024;

        if(MB == 0) {
            return "" + KB;
        } else if (KB != 0){
            return (MB) + " " + (KB);
        } else {
            return "" + MB;
        }
    }

    public static void main(String[] args) {
        System.out.println(convert(2050));


    }
}
