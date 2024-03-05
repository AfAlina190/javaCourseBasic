package lessons.lesson_36.task_practice.task_2;

public class Rectangle<T extends Number> implements Figure<T> {
    private T length;
    private T width;

    public Rectangle(T length, T width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public T area() {
        double lengthValue = length.doubleValue();
        double widthValue = width.doubleValue();
        return (T) Double.valueOf(lengthValue * widthValue);
    }
}
