package homework.homework_40.tasks_2_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//коллекция String - получить строку - содержащую все элементы этой коллекции
public class StringProcessing_2 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");

        String concatenatedString = strings.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Concatenated String: " + concatenatedString);
    }
}

