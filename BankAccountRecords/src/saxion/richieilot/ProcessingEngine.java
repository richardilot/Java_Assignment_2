package saxion.richieilot;

import java.util.ArrayList;

public class ProcessingEngine {

    public int YearlyTransactionsCounter(Statement statement) { //menu no 1
        try {
            var CountGetter = new CountGetterItems();
            return CountGetter.TransactionCounter(statement);
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal Argument Detected");
            return 0;
        }
    }


    public int MonthlyTransactionsCounter(Statement statement, int userDateInput) { //menu no 1.2
        try {
            var CountGetter = new CountGetterItems();
            var monthSeparated = CountGetter.MonthSeparated(statement, userDateInput);

            return CountGetter.TransactionCounter(monthSeparated);
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal Argument Detected");
            return 0;
        }

    }

    public ArrayList<MonthlyCategory> CategorialMonthlyTransactionCounter(Statement statement, int userDateInput) { //in the name of jesus menu no 2
        var CountGetter = new CountGetterItems();
        var monthSeparated = CountGetter.MonthSeparated(statement, userDateInput);
        var Category = new CategoryClassifier();
        var MonthlyCategory = new ArrayList<MonthlyCategory>();

        Category.categoryIntegrator(monthSeparated);

        for (var categories : Category.getCategory()) {
            boolean contains = false;
            for (var monthlyCategories : MonthlyCategory) {
                if (monthlyCategories.getCategory().equals(categories.getCategories())) {
                    contains = true;
                    monthlyCategories.setCounter(monthlyCategories.getCounter() + 1);
                }
            }
            if(!contains){
                MonthlyCategory.add(new MonthlyCategory(categories, 0));
            }
        }
        return MonthlyCategory;
    }

    public double Balance(Statement statement){
        double balance =0;
        for (var statements :
                statement.getTransaction()) {
            balance += statements.getAmount();
        }
        return balance;
    }

    public double MonthlyBalance(Statement statement, int userDateInput){
        var month = new CountGetterItems().MonthSeparated(statement, userDateInput);
        return Balance(month);
    }
}