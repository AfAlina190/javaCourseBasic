package homework.homework_21.inheritance.task_1;

// Производный класс для велосипеда
public class Bicycle extends Vehicle {
    private int numberOfWheels;

    public Bicycle(String brand, int year, int numberOfWheels) {
        super(brand, year);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void ringBell() {
        System.out.println("Звонок велосипеда.");
    }
}