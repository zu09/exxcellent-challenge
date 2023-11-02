package de.exxcellent.challenge;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Input {

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
