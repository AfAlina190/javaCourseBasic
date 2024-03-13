package homework.homework_40.var_2;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kris",24,2.4, 2020));
        students.add(new Student("John",22,5.4, 2019));
        students.add(new Student("Alex",27,4.5, 2018));
        students.add(new Student("Kevin",24,3.4, 2022));
        students.add(new Student("Manfred",23,5.0, 2023));
        students.add(new Student("Leo",25,5.5, 2024));

        // Фильтрация по возрасту и среднему баллу
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 25 && student.getAvgGrade() > 4.5)
                .collect(Collectors.toList());

        // Вывод результатов
        System.out.println("Фильтр студентов:");
        displayStudents(filteredStudents);

        // Выбор топ-3 студентов и сортировка по году поступления
        List<Student> top3Students = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAvgGrade).reversed())
                .limit(3)
                .sorted(Comparator.comparingInt(Student::getAdmissionYear))
                .collect(Collectors.toList());

        System.out.println("\nToп 3 студента:");
        displayStudents(top3Students);

        // Группировка студентов по году поступления
        Map<Integer, List<Student>> groupedStudentsByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getAdmissionYear));

        // Вывод результатов
        System.out.println("\nГруппировка студентов по году поступления:");
        displayGroupedStudents(groupedStudentsByYear);
    }

    private static void displayStudents(List<Student> students) {
        students.forEach(student -> System.out.println(student.getName() + " - " + student.getAvgGrade()));
    }

    private static void displayGroupedStudents(Map<Integer, List<Student>> groupedStudents) {
        groupedStudents.forEach((year, studentList) -> {
            System.out.println("Год: " + year);
            displayStudents(studentList);
            System.out.println();
        });
    }
}
