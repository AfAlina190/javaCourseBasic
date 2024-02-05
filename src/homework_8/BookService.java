package homework_8;

public class BookService {
    public static Book createBook(String author, String title) {
        return new Book(author, title);
    }

    public static Book createBookParameters(String author, String title, int pageCount, int catalogNumber, boolean inLibrary) {
        return new Book(author, title, pageCount, catalogNumber, inLibrary);
    }
    public static void editBook(Book book, int catalogNumber, int pageCount, boolean inLibrary) {
        book.setCatalogNumber(catalogNumber);
        book.setPageCount(pageCount);
        book.setInLibrary(inLibrary);
    }
}
