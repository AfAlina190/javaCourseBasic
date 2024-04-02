package homework.homework_6.task_1;

// StringManipulationDemo.java
import homework.homework_6.task_1.StringManipulator;

import java.util.Scanner;

public class StringManipulationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String userString = scanner.nextLine();

        StringManipulator manipulator = new StringManipulator();
        manipulateString(manipulator, userString);
    }

    public static void manipulateString(StringManipulator manipulator, String inputString) {
        System.out.println("3. Последний символ строки: " + manipulator.getLastChar(inputString));

        System.out.println("4. Содержит подстроку 'Java': " +
                manipulator.containsSubstring(inputString, "Java"));

        System.out.println("5. Заменить 'а' на 'о': " +
                manipulator.replaceCharacters(inputString, 'а', 'о'));

        System.out.println("6. Преобразовать к верхнему регистру: " +
                manipulator.toUpperCase(inputString));

        System.out.println("7. Преобразовать к нижнему регистру: " +
                manipulator.toLowerCase(inputString));

        System.out.println("8. Вырезать строку 'Java': " +
                manipulator.extractSubstring(inputString, "Java"));
    }
}
