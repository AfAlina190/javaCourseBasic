package homework.homework_29.withList;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumericListOperations {
    public static void main(String[] args) {
        // Создаем LinkedList для хранения целых чисел
        List<Integer> numericList = new LinkedList<>();

        // Добавляем случайные числа в диапазоне от 1 до 100
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numericList.add(random.nextInt(100) + 1);
        }

        // Выводим список чисел
        System.out.println("Список чисел: " + numericList);

        // Находим и выводим максимальное и минимальное числа в списке
        int maxNumber = Collections.max(numericList);
        int minNumber = Collections.min(numericList);
        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);

        // Сортируем список в порядке возрастания и выводим его
        Collections.sort(numericList);
        System.out.println("Список после сортировки: " + numericList);
    }
}
