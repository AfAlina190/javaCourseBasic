package homework.homework_21.inheritance.task_2;

public class Circle extends Shape {
    private double radius;

    // Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода calculateArea для окружности
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}