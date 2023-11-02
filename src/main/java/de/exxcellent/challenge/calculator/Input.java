package de.exxcellent.challenge.calculator;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.dataclasses.WeatherData;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Input {

    // Reads CSV file from input path and maps the row to the WeatherData data class.
    public static <T extends RangeObject> List<T> readWeatherData(Class<T> type, String path){
        try {
                List<T> beans = new CsvToBeanBuilder<T>(new FileReader(path))
                    .withType(type)
                    .build().parse();

                if(beans != null){
                    for(RangeObject data : beans){
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
