package lessons.lesson_31;
import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Pear", "Grapes", "Kiwi", "Pineapple", "Mango", "Grapefruit", "Peach", "Apricot", "Plum", "Strawberry", "Raspberry", "Cherry", "Sour cherry", "Pomegranate", "Coconut", "Carambola", "Lemon", "Lime", "Pomelo", "Feijoa", "Cornelian cherry", "Guava"));

        System.out.println("Оригинальный список: " + words);

        replaceWordsContainingA(words);

        System.out.println("Переделанный список: " + words);
    }

    private static void replaceWordsContainingA(List<String> words) {
        ListIterator<String> iterator = words.listIterator();

        while (iterator.hasNext()) {
            String currentWord = iterator.next();

            if (currentWord.contains("a")) {
                iterator.set("$");
            }
        }
    }
}
