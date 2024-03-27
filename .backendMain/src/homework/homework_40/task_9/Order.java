package homework.homework_40.task_9;

import java.time.LocalDate;


public class Order {
    int orderId;
    LocalDate date;
    double amount;
    String status;

    public Order(int orderId, LocalDate date, double amount, String status) {
        this.orderId = orderId;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}

