package saxion.richieilot;

import java.util.ArrayList;

public class DateSeparator {
    ArrayList<Date> date = new ArrayList<>();

    public void dateSeparator(Statement statement){
        for (var index :
                statement.getTransaction()) {
            var Parser = index.getDate().split("-");
            this.date.add(new Date(Integer.parseInt(Parser[0]), Integer.parseInt(Parser[1]), Integer.parseInt(Parser[2])));
        }
    }

    public ArrayList<Date> getDate() {
        return this.date;
    }

}
