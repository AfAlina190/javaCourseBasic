package homework_6.task_4;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // Тема: создание переменной типа String
        String myName = "Алина Афанасьева";
        System.out.println("Значение переменной myName: " + myName);

        // Тема: Конкатенация строк
        String greeting = "Hi " + myName;
        System.out.println(greeting);

        // Тема: Считывание строк с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
