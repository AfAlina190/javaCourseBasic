package lessons.lesson_36.task_practice;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        // Создание экземпляра Pair<String, Integer>
        Pair<String, Integer> pair1 = new Pair<>("Hello", 42);

        // Создание экземпляра Pair<Integer, String>
        Pair<Integer, String> pair2 = new Pair<>(123, "World");


        System.out.println("Первая пара: " + pair1.getFirst() + ", " + pair1.getSecond());
        System.out.println("Вторая пара: " + pair2.getFirst() + ", " + pair2.getSecond());
    }
}

