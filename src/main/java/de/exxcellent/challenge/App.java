package de.exxcellent.challenge;

import de.exxcellent.challenge.calculator.Calculator;
import de.exxcellent.challenge.calculator.Input;
import de.exxcellent.challenge.dataclasses.FootballData;
import de.exxcellent.challenge.dataclasses.WeatherData;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
        List<WeatherData> weatherDataList = Input.readWeatherData("src/main/resources/de/exxcellent/challenge/weather.csv");

        assert weatherDataList != null;
        WeatherData min = Calculator.getAbsoulteDifference(weatherDataList);

        String dayWithSmallestTempSpread = Integer.toString(min.getDay());     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
