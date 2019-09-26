package com.manchesterdigital;

public class NCP {
    final static int COST1 = 300;
    final static int COST2 = 350;
    final static int COST3 = 400;
    final static int COST4 = 500;
    final static int COST5 = 700;


    public static int calculateCost(int hour) {
        int cost = COST3;
        if(!(hour >= 0 && hour < 25)) {
            throw new RuntimeException("Time is out of range: " + hour);
        }

        if(hour >= 0 && hour < 5) {
            cost = COST1;
        } else if (hour < 10) {
            cost = COST2;
        } else if(hour < 15) {
            cost = COST4;
        } else if (hour < 20) {
            cost = COST5;
        }
        return cost;
    }

    public static int calculateCost(String vehicleType, int hour) {
        if(vehicleType.equalsIgnoreCase("van")) {
            return 2 * calculateCost(hour);
        } else {
            return calculateCost(hour);
        }
    }


}
