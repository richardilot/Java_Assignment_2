package saxion.richieilot;

import java.util.ArrayList;

public class CategoryClassifier {
    private ArrayList<Category> category = new ArrayList<>();

    public void categoryIntegrator(Statement statement){
        for(var transactions:statement.getTransaction()){
            var categories = transactions.getCategory();
            this.category.add(new Category(categories));
        }
    }

    public ArrayList<Category> getCategory(){
        return this.category;
    }

}
