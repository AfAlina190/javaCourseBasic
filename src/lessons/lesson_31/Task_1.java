package lessons.lesson_31;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 25, 5, 30, 15));

        int x = 20;

        System.out.println("Original List: " + numbers);

        removeNumbersGreaterThanX(numbers, x);

        System.out.println("Modified List: " + numbers);
    }

    private static void removeNumbersGreaterThanX(List<Integer> numbers, int x) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() > x) {
                iterator.remove();
            }
        }
    }
}
