package de.exxcellent.challenge;

import de.exxcellent.challenge.calculator.Calculator;
import de.exxcellent.challenge.calculator.Input;
import de.exxcellent.challenge.dataclasses.FootballData;
import de.exxcellent.challenge.dataclasses.WeatherData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 test cases.
 * @author Felix Wollinsky <felix-wollinsky@gmx.de>
 */
class AppTest {

    private final String footballPath = "src/main/resources/de/exxcellent/challenge/football.csv";
    private final String weatherPath = "src/main/resources/de/exxcellent/challenge/weather.csv";
    private List<FootballData> footballDataList;
    private List<WeatherData> weatherDataList;

    @Test
    @DisplayName("Read both files and test data sample")
    void readCSVs() {
        weatherDataList = Input.csvToRangeClass(WeatherData.class, weatherPath);
        footballDataList = Input.csvToRangeClass(FootballData.class, footballPath);
        assertEquals(1004.5, weatherDataList.get(0).getrAvSLP(), "There was an error reading the content of the weather.csv");
        assertEquals("Leicester", footballDataList.get(footballDataList.size()-1).getTeam(), "There was an error reading the content of the football.csv");
    }

    @Test
    @DisplayName("Read faulty file and check for empty list")
    void readFaultyCSVs() {
        footballDataList = Input.csvToRangeClass(FootballData.class,"football_faulty.csv");
        assertTrue(footballDataList.isEmpty(), "The faulty csv wasn't detected!");
    }

    @Test
    @DisplayName("Weather: Check if day is correct")
    void runWeather() {
        weatherDataList = Input.csvToRangeClass(WeatherData.class, weatherPath);
        WeatherData weather = Calculator.minAbsoluteDifference(weatherDataList);
        assertEquals(14, weather.getDay(), "The function didn't find the correct solution!");
    }

    @Test
    @DisplayName("Football: Check if team is correct")
    void runFootball() {
        footballDataList = Input.csvToRangeClass(FootballData.class,footballPath);
        FootballData football = Calculator.minAbsoluteDifference(footballDataList);
        assertEquals("Aston_Villa", football.getTeam(), "The function didn't find the correct solution!");
    }

}