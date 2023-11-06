package de.exxcellent.challenge.calculator;

import de.exxcellent.challenge.dataclasses.RangeClass;

import java.util.List;

/**
 * The Calculator class contains mathematical methods for RangeClass.
 */
public class Calculator {

    /**
     * Searches for the smallest absolute difference in a list of RangeClasses objects and returns it.
     * @param list The list in which the smallest absolute range should be searched for.
     * @return Returns the RangeClass object with the smallest absolute range.
     * @param <T> Type of RangeClass implementation.
     */
    public static <T extends RangeClass> T minAbsoluteDifference(List<T> list){
        T min = null;
        int minDiff = Integer.MAX_VALUE;

        assert !list.isEmpty() : "Couldn't find min. absolute difference: List is empty";

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
