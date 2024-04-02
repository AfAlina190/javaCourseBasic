package testing.carArrayTesting;

public class CarTestingDemo {
    private int id;
    private String model;
    private String color;
    private String type;
    private int year;
    private double price;

    public CarTestingDemo(int id, String model, String color, String type, int year, double price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CarTestingDemo{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
