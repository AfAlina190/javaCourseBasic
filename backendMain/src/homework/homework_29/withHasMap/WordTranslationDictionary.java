package homework.homework_29.withHasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordTranslationDictionary {
    public static void main(String[] args) {
        // Создаем HashMap для словаря перевода слов
        Map<String, String> dictionary = new HashMap<>();

        // Добавляем в словарь пять пар слов
        dictionary.put("apple", "яблоко");
        dictionary.put("cat", "кот");
        dictionary.put("sun", "солнце");
        dictionary.put("house", "дом");
        dictionary.put("book", "книга");

        // Выводим словарь
        System.out.println("Словарь перевода слов: " + dictionary);

        // Ввод слова от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на английском: ");
        String wordToTranslate = scanner.nextLine().toLowerCase();

        // Выводим перевод слова, если оно присутствует в словаре
        if (dictionary.containsKey(wordToTranslate)) {
            System.out.println("Перевод слова: " + dictionary.get(wordToTranslate));
        } else {
            System.out.println("Слово не найдено в словаре.");
        }

        // Удаляем слово из словаря и выводим обновленный список слов
        System.out.print("Введите слово для удаления из словаря: ");
        String wordToDelete = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(wordToDelete)) {
            dictionary.remove(wordToDelete);
            System.out.println("Слово удалено. Обновленный словарь: " + dictionary);
        } else {
            System.out.println("Слово не найдено в словаре.");
        }
    }
}
