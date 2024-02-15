package homework.homework_7.task_1;

import java.util.Scanner;

public class StringOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String userString = scanner.nextLine();

        StringOperations stringOperations = new StringOperations(userString);

        stringOperations.printLastChar();
        stringOperations.checkSubstring("Java");
        stringOperations.replaceChars('а', 'о');
        stringOperations.toUpperCase();
        stringOperations.toLowerCase();
        stringOperations.cutSubstring("Java");
    }
}
