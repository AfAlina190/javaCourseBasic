package lessons.lesson_36.task_practice.task_2;

public class Circle<T extends Number> implements Figure<T> {
    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public T area() {
        double radiusValue = radius.doubleValue();
        return (T) Double.valueOf(Math.PI * radiusValue * radiusValue);
    }
}
