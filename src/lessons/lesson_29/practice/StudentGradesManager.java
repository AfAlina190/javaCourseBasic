package lessons.lesson_29.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> studentsGrades = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите имя студента (или \"exit\" для завершения): ");
            String studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                break;
            }

            Map<String, Integer> subjectGrades = new HashMap<>();

            while (true) {
                System.out.print("Название предмета: ");
                String subject = scanner.nextLine();

                if (subject.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Оценка: ");
                int grade = scanner.nextInt();
                scanner.nextLine();

                subjectGrades.put(subject, grade);
            }

            studentsGrades.put(studentName, subjectGrades);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : studentsGrades.entrySet()) {
            System.out.println("Студент: " + entry.getKey());
            System.out.println("Оценки:");
            for (Map.Entry<String, Integer> subjectGrade : entry.getValue().entrySet()) {
                System.out.println(subjectGrade.getKey() + ": " + subjectGrade.getValue());
            }
            System.out.println();
        }

        System.out.print("Введите имя студента для просмотра оценок: ");
        String requestedStudent = scanner.nextLine();

        Map<String, Integer> requestedGrades = studentsGrades.get(requestedStudent);
        if (requestedGrades != null) {
            System.out.println("Оценки студента " + requestedStudent + ":");
            for (Map.Entry<String, Integer> entry : requestedGrades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("Студент с именем " + requestedStudent + " не найден.");
        }
    }
}

