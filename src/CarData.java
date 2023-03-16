import java.time.LocalDate;

public class CarData {
    private LocalDate madeOfStart;
    private String model;
    private int price;
    private String color;

    public CarData(LocalDate madeOfStart, String model, int price, String color) {
        this.madeOfStart = madeOfStart;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public LocalDate getMadeOfStart() {
        return madeOfStart;
    }

    public void setMadeOfStart(LocalDate madeOfStart) {
        this.madeOfStart = madeOfStart;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " CarData {"+" Чыгарылган жылы: " + madeOfStart + ", Модели - " + model + ", Баасы-> " + price + ", Тусу: " + color + '}';
    }
}
