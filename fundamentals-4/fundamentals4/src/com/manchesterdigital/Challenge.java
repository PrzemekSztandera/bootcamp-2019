package com.manchesterdigital;

public class Challenge {
    private static final int BAD_OUTCOME = 0;
    private static final int GOOD_OUTCOME = 1;
    private static final int GREAT_OUTCOME = 2;

    static int teaParty(int tea, int candy) {

        int result = GOOD_OUTCOME;
        if(tea < 5 || candy < 5) {
            result = BAD_OUTCOME;
        } else if ((candy >= (2 * tea)) || (tea >= (2 * candy))) {
            result = GREAT_OUTCOME;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));
        System.out.println(teaParty(3, 8));
        System.out.println(teaParty(20, 6));
    }
}
