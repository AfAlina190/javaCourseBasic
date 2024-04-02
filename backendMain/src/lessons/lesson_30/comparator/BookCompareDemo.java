package lessons.lesson_30.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookCompareDemo {
    public static void main(String[] args) {
        Comparator<Books> booksComparator = new BooksComparator();

        Set<Books> booksSet = new TreeSet<>(booksComparator);

        booksSet.add(new Books( 4, "Три товарища"));
        booksSet.add(new Books( 5, "Мои поля"));
        booksSet.add(new Books( 6, "Наши звезды"));
        booksSet.add(new Books( 1, "Три медведя"));
        booksSet.add(new Books( 2, "Три поросенка"));
        booksSet.add(new Books( 3, "Два дуба"));


        System.out.println(booksSet);



    }
}
