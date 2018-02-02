package models;

import javax.persistence.Embeddable;

@Embeddable
public class Bar {
    private Long x;
    public String barName;

    public Bar() {
    }

    public Bar(Long x, String barName) {
        this.x = x;
        this.barName = barName;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "x=" + x +
                ", barName='" + barName + '\'' +
                '}';
    }
}
