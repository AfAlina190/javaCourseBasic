package lessons.lesson_36.task_practice;

import java.util.List;

public class MixedPair<T, U> {
    private T first;
    private List<U> second;

    public MixedPair(T first, List<U> second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public List<U> getSecond() {
        return second;
    }

    public static void main(String[] args) {
        // Создание экземпляра MixedPair<String, Integer>
        MixedPair<String, Integer> pair1 = new MixedPair<>("Hello", List.of(1, 2, 3));

        // Создание экземпляра MixedPair<Integer, String>
        MixedPair<Integer, String> pair2 = new MixedPair<>(123, List.of("А", "b", "c"));

        System.out.println("Pair 1: " + pair1.getFirst() + ", " + pair1.getSecond());
        System.out.println("Pair 2: " + pair2.getFirst() + ", " + pair2.getSecond());
    }
}

