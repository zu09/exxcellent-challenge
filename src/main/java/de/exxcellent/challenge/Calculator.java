package de.exxcellent.challenge;

import java.util.List;

public class Calculator {

    //Searches for the smallest difference of min. and max. temperature and returns the data class of it
    public static WeatherData getMinTempSpread(List<WeatherData> list){
        WeatherData min = null;
        int minSpread = Integer.MAX_VALUE;

        for(WeatherData data: list){
            int spread = data.getMxT() - data.getMnT() ;
            if(spread < minSpread){
                minSpread = spread;
                min = data;
            }
        }
        return min;
    }
}
