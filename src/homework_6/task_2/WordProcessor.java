package homework_6.task_2;

public class WordProcessor {
    public static String processWords(String firstWord, String secondWord) {
        int firstHalfLength = (firstWord.length() + 1) / 2;
        int secondHalfLength = secondWord.length() / 2;

        String processedWord = firstWord.substring(0, firstHalfLength) +
                secondWord.substring(secondHalfLength);

        return processedWord;
    }
}

