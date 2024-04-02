package homework.homework_29.withHashSet;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesSet {
    public static void main(String[] args) {
        // Создаем HashSet для хранения имен

        Set<String> uniqueNames = new HashSet<>();

        // Добавляем в набор десять имен, некоторые из которых могут повторяться
        uniqueNames.add("Анна");
        uniqueNames.add("Петр");
        uniqueNames.add("Мария");
        uniqueNames.add("Иван");
        uniqueNames.add("Анна"); // повторяющееся имя
        uniqueNames.add("Сергей");
        uniqueNames.add("Елена");
        uniqueNames.add("Петр"); // повторяющееся имя
        uniqueNames.add("Ольга");
        uniqueNames.add("Алексей");

        // Выводим количество уникальных имен в наборе
        System.out.println("Количество уникальных имен: " + uniqueNames.size());

        // Проверяем, содержит ли набор определенное имя
        String searchName = "Мария";
        if (uniqueNames.contains(searchName)) {
            System.out.println("Набор содержит имя " + searchName);
        } else {
            System.out.println("Набор не содержит имя " + searchName);
        }
    }
}
