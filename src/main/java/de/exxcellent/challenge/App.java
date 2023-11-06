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
 * @author Felix Wollinsky <felix-wollinsky@gmx.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        List<WeatherData> weatherDataList = Input.csvToRangeClass(WeatherData.class, "src/main/resources/de/exxcellent/challenge/weather.csv");
        List<FootballData> footballDataList = Input.csvToRangeClass(FootballData.class,"src/main/resources/de/exxcellent/challenge/football.csv");

        WeatherData weather = Calculator.minAbsoluteDifference(weatherDataList);
        FootballData football = Calculator.minAbsoluteDifference(footballDataList);

        String dayWithSmallestTempSpread = Integer.toString(weather.getDay());
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = football.getTeam(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
