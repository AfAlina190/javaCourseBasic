package lessons.lesson_22;

import java.util.Arrays;

// Интерфейс для общих операций обработки текста
interface TextProcessing {
    void processText(String[] words);
}

// Класс для подсчета количества вхождений слова в тексте
class WordCount implements TextProcessing {
    private String targetWord;

    public WordCount(String targetWord) {
        this.targetWord = targetWord;
    }

    @Override
    public void processText(String[] words) {
        long count = Arrays.stream(words)
                .filter(word -> word.equalsIgnoreCase(targetWord))
                .count();

        System.out.println("Количество вхождений слова '" + targetWord + "': " + count);
    }
}

// Класс для поиска самого длинного слова в тексте
class LongestWord implements TextProcessing {
    @Override
    public void processText(String[] words) {
        String longestWord = Arrays.stream(words)
                .max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
                .orElse("");

        System.out.println("Самое длинное слово: " + longestWord);
    }
}

// Класс для обратной сортировки слов по алфавиту
class ReverseAlphabeticalOrder implements TextProcessing {
    @Override
    public void processText(String[] words) {
        Arrays.sort(words, (word1, word2) -> word2.compareToIgnoreCase(word1));

        System.out.println("Слова в обратном алфавитном порядке:");
        Arrays.stream(words).forEach(System.out::println);
    }
}

