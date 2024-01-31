package homework_8;

// Класс BookService для сервисных методов
public class BookService {
    // Метод для создания книги только с автором и названием
    public static Book createBook(String author, String title) {
        return new Book(author, title);
    }

    // Метод для создания книги с полными параметрами
    public static Book createBookParameters(String author, String title, int pageCount, int catalogNumber, boolean inLibrary) {
        return new Book(author, title, pageCount, catalogNumber, inLibrary);
    }

    // Метод для редактирования книги
    public static void editBook(Book book, int catalogNumber, int pageCount, boolean inLibrary) {
        book.setCatalogNumber(catalogNumber);
        book.setPageCount(pageCount);
        book.setInLibrary(inLibrary);
    }
}
