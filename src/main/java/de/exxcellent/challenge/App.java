package de.exxcellent.challenge;

import de.exxcellent.challenge.calculator.Calculator;
import de.exxcellent.challenge.calculator.Input;
import de.exxcellent.challenge.dataclasses.FootballData;
import de.exxcellent.challenge.dataclasses.WeatherData;

import java.util.List;

/**
 * My solution for the eXXcellent programming challenge!
 *
 * @author Felix Wollinsky <felix-wollinsky@gmx.de>
 */
public final class App {

    /**
     * The main method reads the two .csv files and searches for the smallest temperature spread and smallest goal spread.
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
