package de.exxcellent.challenge.calculator;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Input {

    // Reads CSV file from input path and maps the row to the WeatherData data class.
    public static List<WeatherData> readWeatherData(String path){
        try {
                List<WeatherData> beans = new CsvToBeanBuilder<WeatherData>(new FileReader(path))
                    .withType(WeatherData.class)
                    .build().parse();

                if(beans != null){
                    for(WeatherData data : beans){
                        System.out.println(data);
                    }
                }

                return beans;
        }
        catch (IOException e) {
           e.printStackTrace();
        }
        return null;
    }


}
