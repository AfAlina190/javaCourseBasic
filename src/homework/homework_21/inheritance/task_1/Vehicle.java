package homework.homework_21.inheritance.task_1;

// Базовый класс транспортного средства
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Транспортное средство начало движение.");
    }

    public void stop() {
        System.out.println("Транспортное средство остановилось.");
    }
}




