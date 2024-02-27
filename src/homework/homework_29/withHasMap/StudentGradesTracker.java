package homework.homework_29.withHasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesTracker {
    public static void main(String[] args) {
        // Создаем HashMap для отслеживания оценок студентов
        Map<String, Double> studentGrades = new HashMap<>();

        // Добавляем данные о пяти студентах
        studentGrades.put("Иванов", 4.5);
        studentGrades.put("Петров", 3.8);
        studentGrades.put("Сидоров", 4.2);
        studentGrades.put("Кузнецов", 4.9);
        studentGrades.put("Смирнова", 3.5);

        // Выводим данные о студентах
        System.out.println("Отслеживание оценок студентов: " + studentGrades);

        // Находим и выводим имя студента с наивысшим средним баллом
        String topStudent = findTopStudent(studentGrades);
        System.out.println("Студент с наивысшим средним баллом: " + topStudent);

        // Изменяем средний балл одного из студентов
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента для изменения его среднего балла: ");
        String studentNameToUpdate = scanner.nextLine();
        System.out.print("Введите новый средний балл: ");
        double newGrade = scanner.nextDouble();
        updateStudentGrade(studentGrades, studentNameToUpdate, newGrade);

        // Выводим обновленные данные о студентах
        System.out.println("Обновленные данные оценок студентов: " + studentGrades);
    }

    private static String findTopStudent(Map<String, Double> grades) {
        String topStudent = null;
        double maxGrade = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        return topStudent;
    }

    private static void updateStudentGrade(Map<String, Double> grades, String studentName, double newGrade) {
        if (grades.containsKey(studentName)) {
            grades.put(studentName, newGrade);
            System.out.println("Средний балл студента " + studentName + " обновлен.");
        } else {
            System.out.println("Студент " + studentName + " не найден в списке.");
        }
    }
}
