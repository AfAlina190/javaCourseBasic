package homework.homework_40.tasks_2_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//коллекция String - получить коллекцию элементов у которых нечетное количество символов

public class StringProcessing {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");

        List<String> oddLengthStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Strings with odd length: " + oddLengthStrings);
    }
}
