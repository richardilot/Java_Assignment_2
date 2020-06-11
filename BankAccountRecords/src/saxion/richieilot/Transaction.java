package saxion.richieilot;

public class Transaction {
   protected String ID;
   protected String Date;
   protected double Amount;
   protected String subCategory;
   protected String Category;


    public Transaction(String ID, String date, double amount, String subCategory, String category) {
        this.ID = ID;
        this.Date = date;
        this.Amount = amount;
        this.subCategory = subCategory;
        this.Category = category;

    }

    public Transaction() {

    }

    @Override
    public String toString() {
        return "\nTransaction{" +
                "ID='" + ID + '\'' +
                ", Date='" + Date + '\'' +
                ", Amount=" + Amount +
                ", subCategory='" + subCategory + '\'' +
                ", Category='" + Category + '\'' +
                "}";
    }

    public String getDate() {
        return Date;
    }

    public double getAmount() {
        return Amount;
    }


    public String getCategory() {
        return Category;
    }

}
