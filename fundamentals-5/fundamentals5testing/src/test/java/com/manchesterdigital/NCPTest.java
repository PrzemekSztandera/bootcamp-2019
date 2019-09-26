package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NCPTest {


    @Test(expected = RuntimeException.class)
    public void whenTimeIsOutsideOfARangeThenExceptionIsThrown() {
        // arrange
        int time1 = -1;
        int time2 = 25;
        // act
        NCP.calculateCost(time1);
        NCP.calculateCost(time2);
    }


    @Test
    public void whenTimeRangeBetweenIs0And4CalculateCostShouldReturn300() {
        // arrange
        int time = 0;
        int time2 = 4;
        // act
        int result =  NCP.calculateCost(time);
        int result2 = NCP.calculateCost(time2);
        // assert
        assertThat(result).isEqualTo(300);
        assertThat(result2).isEqualTo(300);
    }

    @Test
    public void whenTimeRangeBetweenIs5And9CalculateCostShouldReturn350() {
        // arrange
        int time = 5;
        int time2 = 9;
        // act
        int result =  NCP.calculateCost(time);
        int result2 = NCP.calculateCost(time2);
        // assert
        assertThat(result).isEqualTo(350);
        assertThat(result2).isEqualTo(350);
    }

    @Test
    public void whenTimeRangeBetweenIs10And14CalculateCostShouldReturn350() {
        // arrange
        int time = 10;
        int time2 = 14;
        // act
        int result =  NCP.calculateCost(time);
        int result2 = NCP.calculateCost(time2);
        // assert
        assertThat(result).isEqualTo(500);
        assertThat(result2).isEqualTo(500);
    }

    @Test
    public void whenTimeRangeBetweenIs15And19CalculateCostShouldReturn700() {
        // arrange
        int time = 15;
        int time2 = 19;
        // act
        int result =  NCP.calculateCost(time);
        int result2 = NCP.calculateCost(time2);
        // assert
        assertThat(result).isEqualTo(700);
        assertThat(result2).isEqualTo(700);
    }

    @Test
    public void whenTimeRangeBetweenIs20And23CalculateCostShouldReturn400() {
        // arrange
        int time = 20;
        int time2 = 23;
        // act
        int result =  NCP.calculateCost(time);
        int result2 = NCP.calculateCost(time2);
        // assert
        assertThat(result).isEqualTo(400);
        assertThat(result2).isEqualTo(400);
    }

    @Test
    public void whenVehicleIsAVanCalculateCostShouldReturnCostTimesTwo() {
        // arrange
        String vehicle = "van";
        int time = 0;
        // act
        int result = NCP.calculateCost(vehicle, time);
        // assert
        assertThat(result).isEqualTo(600);
    }
}
