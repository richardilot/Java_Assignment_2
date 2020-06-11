package saxion.richieilot;

import java.util.ArrayList;

public class TransactionsCollector{
ArrayList<String[]> rawData;

    public TransactionsCollector(ArrayList<String[]> rawData) {
        this.rawData = rawData;
    }

    public Statement readData(){

            var newStatement = new Statement();
            var datas = rawData;
        for (String[] data : datas) {
            newStatement.addTransaction(data[0], data[1], Double.parseDouble(data[2]), data[3], data[4]);
        }
            return newStatement;

    }
}
