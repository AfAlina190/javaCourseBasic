package homework.homework_21.inheritance.task_1;

// Производный класс для автомобиля
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("Открыт багажник автомобиля.");
    }
}