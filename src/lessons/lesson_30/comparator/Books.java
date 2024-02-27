package lessons.lesson_30.comparator;

import java.util.Objects;

public class Books {
private int id;
private String nameBook;

    public Books(int id, String nameBook) {
        this.id = id;
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getId() {
        return id;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books books)) return false;
        return id == books.id && Objects.equals(nameBook, books.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameBook);
    }
}
