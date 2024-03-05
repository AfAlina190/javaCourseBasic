package lessons.lesson_32.task_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String text) {
        Deque<Character> charDeque = new ArrayDeque<>();

        // Заполнение очереди символами из строки (игнорируем пробелы и регистр)
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charDeque.offer(c);
            }
        }

        // Проверка на палиндром
        while (charDeque.size() > 1) {
            if (!charDeque.pollFirst().equals(charDeque.pollLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palindromeText = "Тут как тут";
        String nonPalindromeText = "Не палиндром";

        System.out.println(isPalindrome(palindromeText)); // Выводит true
        System.out.println(isPalindrome(nonPalindromeText)); // Выводит false
    }
}
