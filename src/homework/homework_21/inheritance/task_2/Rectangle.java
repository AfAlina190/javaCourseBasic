package homework.homework_21.inheritance.task_2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // Конструктор класса Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Реализация метода calculateArea для прямоугольника
    @Override
    public double calculateArea() {
        return width * height;
    }
}
