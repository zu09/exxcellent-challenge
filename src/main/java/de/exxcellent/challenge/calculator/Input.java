package de.exxcellent.challenge.calculator;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.dataclasses.RangeClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;


//The Input class contains data gathering methods that map the data to data classes.
public class Input {

    // Reads CSV file from input path and maps the row to a RangeClass data class which type is passed as an input parameter.
    public static <T extends RangeClass> List<T> csvToRangeClass(Class<T> type, String path){
        try {
                List<T> beans = new CsvToBeanBuilder<T>(new FileReader(path))
                    .withType(type)
                    .build().parse();

                if(beans != null){
                    for(RangeClass data : beans){
                        System.out.println(data);
                    }
                }

                return beans;
        }
        catch (IOException e) {
           System.out.printf("There was a problem with reading the file in path: %s%n", path);
        }
        return null;
    }


}
