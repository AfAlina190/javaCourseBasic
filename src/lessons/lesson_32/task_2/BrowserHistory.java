package lessons.lesson_32.task_2;

import java.util.LinkedList;
import java.util.Queue;

public class BrowserHistory {
    private Queue<String> history;

    public BrowserHistory() {
        this.history = new LinkedList<>();
    }

    // Добавление просмотренной страницы в историю
    public void addPage(String page) {
        history.offer(page);
    }

    // Просмотр всей истории
    public void viewHistory() {
        System.out.println("Browser History:");
        for (String page : history) {
            System.out.println(page);
        }
        System.out.println("End of History");
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        // Добавление страниц в историю
        browserHistory.addPage("https://www.w3schools.com/java/java_exercises.asp");
        browserHistory.addPage("https://create-react-app.dev/docs/adding-bootstrap/");
        browserHistory.addPage("https://github.com/AfAlina190?tab=repositories");

        // Просмотр всей истории
        browserHistory.viewHistory();
    }
}
