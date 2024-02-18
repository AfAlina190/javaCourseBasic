package homework.homework_21.inheritance.task_2;

public class ShapeDemo {
    public static void main(String[] args) {
        // Пример использования классов для вычисления площади различных фигур

        // Создание объекта Circle (круг) с радиусом 5
        Circle circle = new Circle(5);
        // Вычисление площади круга и вывод результата
        System.out.println("Площадь круга: " + circle.calculateArea());

        // Создание объекта Rectangle (прямоугольник) с шириной 4 и высотой 6
        Rectangle rectangle = new Rectangle(4, 6);
        // Вычисление площади прямоугольника и вывод результата
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        // Создание объекта Triangle (треугольник) с основанием 3 и высотой 8
        Triangle triangle = new Triangle(3, 8);
        // Вычисление площади треугольника и вывод результата
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
    }
}
