package lessons.lesson_22;


// Класс для демонстрации работы обработчиков текста
public class TextProcessorDemo {
    public static void main(String[] args) {
        String text = "Java is a popular programming language.\n" +
                "\n" +
                "Java is used to develop mobile apps, web apps, desktop apps, games and much more.";

        // Разделение текста на слова
        String[] words = text.split("\\s+");

        // Пример использования классов для обработки текста
        TextProcessing wordCounter = new WordCount("Java");
        wordCounter.processText(words);

        TextProcessing longestWordFinder = new LongestWord();
        longestWordFinder.processText(words);

        TextProcessing reverseOrder = new ReverseAlphabeticalOrder();
        reverseOrder.processText(words);
    }
}