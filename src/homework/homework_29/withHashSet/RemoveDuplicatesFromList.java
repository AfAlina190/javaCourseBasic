package homework.homework_29.withHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        // Создаем ArrayList с дублирующимися элементами
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("orange");
        originalList.add("banana");
        originalList.add("apple");
        originalList.add("grape");
        originalList.add("orange");

        // Преобразуем ArrayList в HashSet, чтобы удалить дубликаты
        Set<String> uniqueSet = new HashSet<>(originalList);

        // Выводим новый список без дубликатов
        System.out.println("Список без дубликатов: " + uniqueSet);

        // Добавляем новые элементы в HashSet
        uniqueSet.add("pear");
        uniqueSet.add("kiwi");

        // Преобразуем HashSet обратно в ArrayList
        List<String> newList = new ArrayList<>(uniqueSet);

        // Выводим обновленный список
        System.out.println("Обновленный список: " + newList);
    }
}
