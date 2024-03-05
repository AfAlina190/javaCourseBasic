package lessons.lesson_36.task_practice.task_2;

public class FigureDemo {
    public static void main(String[] args) {
        Circle<Integer> integerCircle = new Circle<>(5);
        System.out.println("Площадь целого круга: " + integerCircle.area());

        Circle<Double> doubleCircle = new Circle<>(5.5);
        System.out.println("Площадь двойного круга: " + doubleCircle.area());

        System.out.println("________________________________________________");

        Rectangle<Integer> integerRectangle = new Rectangle<>(4, 6);
        System.out.println("Площадь целочисленного треугольника: " + integerRectangle.area());

        Rectangle<Double> doubleRectangle = new Rectangle<>(4.5, 6.5);
        System.out.println("Площадь двойного прямоугольника: " + doubleRectangle.area());
    }
}
