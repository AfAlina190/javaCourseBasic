package homework.homework_21.encapsulation.task_1;

public class BankAccoutDemo {
    public static void main(String[] args) {
        // Пример использования
        BankAccount account = new BankAccount(1000);

        System.out.println("Текущий баланс: " + account.getBalance());
        account.deposit(500);
        System.out.println("Текущий баланс: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}

