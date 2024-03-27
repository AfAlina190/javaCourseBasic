package homework.homework_18.task_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordArrays {
    public static void main(String[] args) {

        String[] wordsArray = {"apple", "banana", "orange", "kiwi", "grape", "strawberry"};


        List<String> evenLengthWords = new ArrayList<>();
        List<String> oddLengthWords = new ArrayList<>();

        for (String word : wordsArray) {
            if (word.length() % 2 == 0) {
                evenLengthWords.add(word);
            } else {
                oddLengthWords.add(word);
            }
        }

        String[] evenLengthArray = evenLengthWords.toArray(new String[0]);
        String[] oddLengthArray = oddLengthWords.toArray(new String[0]);

        System.out.println("Words with even length: " + Arrays.toString(evenLengthArray));
        System.out.println("Words with odd length: " + Arrays.toString(oddLengthArray));
    }
}
