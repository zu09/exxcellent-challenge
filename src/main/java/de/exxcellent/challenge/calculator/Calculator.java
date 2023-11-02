package de.exxcellent.challenge.calculator;

import java.util.List;

public class Calculator {

    //Searches for the smallest difference of min. and max. temperature and returns the data class of it
    public static <T extends RangeObject> T getAbsoulteDifference(List<T> list){
        T min = null;
        int minSpread = Integer.MAX_VALUE;

        for(T data: list){
            int spread = data.bound1() - data.bound2() ;
            if(spread < 0) spread = - spread;
            if(spread < minSpread){
                minSpread = spread;
                min = data;
            }
        }
        return min;
    }
}
