package de.exxcellent.challenge.calculator;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.dataclasses.RangeClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;



/**
 * The Input class contains static methods for parsing data into RangeObject data classes.
 */
public class Input {

    /**
     * Reads CSV file from input path and maps the row to a RangeClass data class which type is passed as an input parameter.
     * @param type The class type of RangeClass needs to be passed as a parameter
     * @param path The path the CSV file is stored in
     * @return Returns a listed with range Objects or an empty list
     */
    public static <T extends RangeClass> List<T> csvToRangeClass(Class<T> type, String path) {
        try {
            //Method is not split in CSV reader and parser bc. it's only one command
                List<T> beans = new CsvToBeanBuilder<T>(new FileReader(path))
                    .withType(type)
                    .build().parse();

                return beans;
        }
        catch (FileNotFoundException e) {
           System.out.printf("There was a problem with reading the file in path: %s%n", path);
        }
        catch (IllegalStateException e){
            System.out.printf("There was a problem with parsing the file in path: %s%n", path);
        }
        return Collections.emptyList();
    }


}
