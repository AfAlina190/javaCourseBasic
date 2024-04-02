package homework.homework_40.task_10;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueTags {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book1", "Author1", Arrays.asList("Fiction", "Adventure")),
                new Book("Book2", "Author2", Arrays.asList("Science", "Fiction")),
                new Book("Book3", "Author3", Arrays.asList("Mystery", "Thriller")),
                new Book("Book4", "Author4", Arrays.asList("Adventure", "Fantasy")),
                new Book("Book5", "Author5", Arrays.asList("Fic", "Adventure")),
                new Book("Book6", "Author6", Arrays.asList("Science", "Fiction")),
                new Book("Book7", "Author7", Arrays.asList("Myst", "Thriller")),
                new Book("Book8", "Author8", Arrays.asList("Adventure", "Fantasy"))
        );

        Set<String> uniqueTags = books.stream()
                .flatMap(book -> book.getTags().stream())
                .collect(Collectors.toSet());

        System.out.println("Unique tags: " + uniqueTags);
    }
}
