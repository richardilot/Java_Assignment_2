package saxion.richieilot;

import java.util.ArrayList;

public class Statement extends Transaction {
    ArrayList<Transaction> transaction;

    public Statement() {
        this.transaction = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransaction(){
        return this.transaction;
    }

    public void addTransaction(String ID, String Date, double Amount, String subCategory, String Category){
        this.transaction.add(new Transaction(ID, Date, Amount, subCategory, Category));
    }

    @Override
    public String toString() {
        return transaction+"\n";
    }

    public int getSize() {
        return transaction.size();
    }

}
