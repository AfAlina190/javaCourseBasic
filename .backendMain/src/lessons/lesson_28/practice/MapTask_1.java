package lessons.lesson_28.practice;

import java.util.HashMap;
import java.util.Map;

/*
       написать метод, который получает на входе массив
       возвращает коллекцию, у которой
       в качестве ключа - элемент массива,
       а значение - количество повторений
        */
public class MapTask_1 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 49, 4, 12, 9, 45, 3, 9, 23, 1, 7, 12, 1, 7, 23};

        Map<Integer, Integer> frequencyMap = calculateFrequency(arr);

        // Выводим результат
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Элемент: " + entry.getKey() + ", Количество повторений: " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> calculateFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Проходим по массиву
        for (int num : arr) {
            // Проверяем, есть ли уже такой элемент в карте
            if (frequencyMap.containsKey(num)) {
                // Если есть, увеличиваем счетчик
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Если нет, добавляем элемент в карту с счетчиком 1
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
}
