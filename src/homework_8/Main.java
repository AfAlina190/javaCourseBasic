package homework_8;

public class Main {
    public static void main(String[] args) {
        // Пример использования классов Book и BookService
        Book book1 = BookService.createBook("Шевченко", "Кобзарь");
        Book book2 = BookService.createBookParameters("Автор2", "Книга2", 200, 123, true);

        // Отображение информации о книгах
        book1.displayBookInfo();
        System.out.println("------------------------");
        book2.displayBookInfo();

        // Пример редактирования книги
        BookService.editBook(book1, 456, 150, false);

        // Отображение обновленной информации о книге
        System.out.println("------------------------");
        book1.displayBookInfo();
    }
}
