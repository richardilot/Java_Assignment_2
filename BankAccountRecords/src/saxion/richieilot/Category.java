package saxion.richieilot;

import java.util.Objects;

public class Category {

    private String categories;

    public Category(String categories){
        this.categories = categories;
    }

    public Category(){
        this.categories = null;
    }

    public String getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categories='" + categories + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(categories, category.categories);
    }
}
