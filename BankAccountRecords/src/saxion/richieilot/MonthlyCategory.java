package saxion.richieilot;

import java.util.Objects;

public class MonthlyCategory extends Category{
    private Category category;
    private int counter;


    public MonthlyCategory(Category category, int counter) {
        this.category = category;
        this.counter = counter;
    }

    public Category getCategory() {
        return category;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "\nMonthlyCategory{" +
                "category=" + category +
                ", counter=" + counter +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MonthlyCategory)) return false;
        if (!super.equals(o)) return false;
        MonthlyCategory that = (MonthlyCategory) o;
        return Objects.equals(category, that.category);
    }
}
