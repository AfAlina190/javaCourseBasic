package homework.homework_21.inheritance.task_2;

public class Triangle extends Shape {
    private double base;
    private double height;

    // Конструктор класса Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Реализация метода calculateArea для треугольника
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
