package homework.homework_21.encapsulation.task_1;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {

        this.balance = initialBalance;
    }

    // Геттер для получения баланса
    public double getBalance() {
        return balance;
    }

    // Сеттер для внесения средств
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount);
        } else {
            System.out.println("Некорректная сумма для внесения.");
        }
    }

    // Сеттер для снятия средств
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount);
        } else {
            System.out.println("Некорректная сумма для снятия или недостаточно средств.");
        }
    }
}
