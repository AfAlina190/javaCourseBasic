package homework_8;

// Класс Book
public class Book {
    private String author;
    private String title;
    private int pageCount;
    private int catalogNumber;
    public boolean inLibrary;

    // Конструктор для создания книги с автором и названием
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // Конструктор для создания книги с полными параметрами
    public Book(String author, String title, int pageCount, int catalogNumber, boolean inLibrary) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.catalogNumber = catalogNumber;
        this.inLibrary = inLibrary;
    }

    // Геттеры и сеттеры для каждого поля
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public boolean isInLibrary() {
        return inLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        this.inLibrary = inLibrary;
    }

    // Метод для отображения информации о книге
    public void displayBookInfo() {
        System.out.println("Автор: " + getAuthor());
        System.out.println("Название: " + getTitle());
        System.out.println("Количество страниц: " + getPageCount());
        System.out.println("Номер в каталоге: " + getCatalogNumber());
        System.out.println("Статус в библиотеке: " + (isInLibrary() ? "В библиотеке" : "На руках"));
    }
}
