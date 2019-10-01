package com.manchesterdigital;


public class StringCalculator {


    public static int intAdd(String string) {
        int sum = 0;
        if(!string.isEmpty()) {
            String[] strArr = string.split("[^0-9]");
            for (int i = 0; i < strArr.length; i++) {
                if(!strArr[i].equals("")) {
                    sum += Integer.parseInt(strArr[i]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        intAdd("afd1b2c3d//");
    }
}
