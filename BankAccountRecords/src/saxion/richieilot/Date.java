package saxion.richieilot;

import java.util.Objects;

public class Date{

    private int Year;
    private int month;
    private int Day;

    public Date(int year, int month, int day) {
        this.Year = year;
        this.month = month;
        this.Day = day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Date{" +
                "Year='" + Year + '\'' +
                ", Month='" + month + '\'' +
                ", Day='" + Day + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return Objects.equals(Year, date.Year) &&
                Objects.equals(month, date.month);
    }

}
