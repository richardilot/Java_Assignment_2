package saxion.richieilot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        var rawData = DataDeserializer.readRawCsv("myData/data.csv"); //input data from csv file
        var data = new TransactionsCollector(rawData); //process data into readable data for the program
        var statement = new Statement(); //statement that put bunch of transactions into one array
        var processor = new ProcessingEngine();
        var menu = new Menu();


        statement = data.readData();
        while(true) {
            var condition = menu.run(statement, processor);
            if (condition) {
                break;
            }
        }

    }
}




