package de.exxcellent.challenge.calculator;

import de.exxcellent.challenge.dataclasses.RangeObject;

import java.util.List;

//The Calculator class contains mathematical methods for RangeObjects
public class Calculator {

    //Searches for the smallest absolute difference in a list of RangeObjects and returns it
    public static <T extends RangeObject> T minAbsoluteDifference(List<T> list){
        T min = null;
        int minDiff = Integer.MAX_VALUE;

        for(T data: list){
            int diff = data.absoulteDifference();
            if(diff < minDiff){
                minDiff = diff;
                min = data;
            }
        }
        return min;
    }
}
