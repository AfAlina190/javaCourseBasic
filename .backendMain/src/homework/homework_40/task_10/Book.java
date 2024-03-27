package homework.homework_40.task_10;

import java.util.List;

class Book {
    String title;
    String author;
    List<String> tags;

    public Book(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }
}

