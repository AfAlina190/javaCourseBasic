package homework.homework_41.task_3;

import java.time.LocalDate;
import java.util.List;

class Order {
    private LocalDate date;
    private List<Purchase> purchases;

    public Order(LocalDate date, List<Purchase> purchases) {
        this.date = date;
        this.purchases = purchases;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }
}