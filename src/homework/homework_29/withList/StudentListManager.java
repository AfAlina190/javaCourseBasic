package homework.homework_29.withList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentListManager {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();

        // Добавляем пять имен студентов
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("David");
        studentNames.add("Eve");

        // Выводим список студентов
        System.out.println("Список студентов: " + studentNames);

        // Выводим список студентов в обратном порядке
        Collections.reverse(studentNames);
        System.out.println("Список студентов в обратном порядке: " + studentNames);

        // Удаление студента по индексу
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс студента для удаления: ");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove >= 0 && indexToRemove < studentNames.size()) {
            studentNames.remove(indexToRemove);
            System.out.println("Студент удален. Обновленный список: " + studentNames);
        } else {
            System.out.println("Недопустимый индекс.");
        }
    }
}
