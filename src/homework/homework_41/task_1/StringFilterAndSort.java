package homework.homework_41.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterAndSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("banana");
        strings.add("Avocado");
        strings.add("apricot");
        strings.add("grape");
        strings.add("Ananas");

        List<String> filteredAndSortedStrings = filterAndSortStrings(strings);
        System.out.println(filteredAndSortedStrings);
    }

    public static List<String> filterAndSortStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }
}