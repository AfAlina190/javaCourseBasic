package homework.homework_21.inheritance.task_1;

public class VehicleDemo {
    public static void main(String[] args) {
        // Создание объекта Car
        Car car = new Car("Toyota", 2022, 4);

        // Использование методов базового класса Vehicle
        System.out.println("Марка автомобиля: " + car.getBrand());
        System.out.println("Год выпуска: " + car.getYear());
        car.start();  // Вызов метода start из базового класса
        car.stop();   // Вызов метода stop из базового класса

        // Использование методов производного класса Car
        System.out.println("Количество дверей: " + car.getNumberOfDoors());
        car.openTrunk();

        System.out.println();

        // Создание объекта Bicycle
        Bicycle bicycle = new Bicycle("Giant", 2022, 2);

        // Использование методов базового класса Vehicle
        System.out.println("Марка велосипеда: " + bicycle.getBrand());
        System.out.println("Год выпуска: " + bicycle.getYear());
        bicycle.start();  // Вызов метода start из базового класса
        bicycle.stop();   // Вызов метода stop из базового класса

        // Использование методов производного класса Bicycle
        System.out.println("Количество колес: " + bicycle.getNumberOfWheels());
        bicycle.ringBell();
    }
}
