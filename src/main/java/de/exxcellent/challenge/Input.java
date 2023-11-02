package de.exxcellent.challenge;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Input {

    public static List<String []> readCsvFile(String path){
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            List<String[]> r = reader.readAll();
            return r;
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
