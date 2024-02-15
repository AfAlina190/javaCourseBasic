package homework.homework_8;

public class Main {
    public static void main(String[] args) {

        Book book1 = BookService.createBook("Шевченко", "Кобзарь");
        Book book2 = BookService.createBookParameters("Автор2", "Книга2", 200, 123, true);

        book1.displayBookInfo();
        System.out.println("------------------------");
        book2.displayBookInfo();

        BookService.editBook(book1, 456, 150, false);

        System.out.println("------------------------");
        book1.displayBookInfo();
    }
}
