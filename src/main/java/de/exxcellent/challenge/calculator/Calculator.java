package de.exxcellent.challenge.calculator;

import de.exxcellent.challenge.dataclasses.RangeClass;

import java.util.List;

//The Calculator class contains mathematical methods for RangeClass
public class Calculator {

    //Searches for the smallest absolute difference in a list of RangeClass and returns it
    public static <T extends RangeClass> T minAbsoluteDifference(List<T> list){
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
