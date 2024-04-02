package lessons.lesson_10.bookVar_1;

public class BookDemo {
    public static void main(String[] args) {

        BookAuthor bookAuthor1 = new BookAuthor("Сенкевич");
        BookAuthor bookAuthor2 = new BookAuthor("Пушкин");
        BookDetails bookDetails1 = new BookDetails(300, "Крестоносцы");
        BookDetails bookDetails2 = new BookDetails(50, "Няне");

        BookAllData bookAllData1 = new BookAllData(bookAuthor1, bookDetails1);
        BookAllData bookAllData2 = new BookAllData(bookAuthor2, bookDetails2);

        System.out.println(bookAllData1);
        System.out.println(bookAllData2);

    }
}
