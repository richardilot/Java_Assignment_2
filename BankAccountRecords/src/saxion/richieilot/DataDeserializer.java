package saxion.richieilot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataDeserializer {
    public static ArrayList<String[]> readRawCsv(String filePath) throws IOException {
        String line;
        var result = new ArrayList<String[]>();

        try (var csvReader = new BufferedReader(new FileReader(filePath))) {

            while ((line = csvReader.readLine()) != null) {
                result.add(line.split("(,\\s)|,"));
            }
        }
        return result;
    }

}
