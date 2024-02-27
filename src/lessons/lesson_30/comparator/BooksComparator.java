package lessons.lesson_30.comparator;

import java.util.Comparator;

public class BooksComparator implements Comparator<Books> {

    @Override
    public int compare(Books book1, Books book2) {
        int compareResult = book1.getId() - book2.getId();
        if (compareResult == 0){
            compareResult = book1.getNameBook().compareTo(book2.getNameBook());

        }
        return compareResult;
    }
}
