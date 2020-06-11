package saxion.richieilot;



public class CountGetterItems {

    public int TransactionCounter(Statement statement){
        return statement.getTransaction().size();
    }

    public Statement MonthSeparated(Statement statement, int userDateInput){
        var DateSorted = new Statement();
        var dates = new DateSeparator();
        dates.dateSeparator(statement);
        for (int i = 0; i < statement.getSize(); i++) {

            if(dates.getDate().get(i).getMonth() == userDateInput){
                DateSorted.getTransaction().add(statement.getTransaction().get(i));
            }

        }
        return DateSorted;
    }

}
