package project.task_2;

import java.util.Arrays;
import java.util.Scanner;

class StudentService {
    public Student[] createStudentsArrayFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int size = scanner.nextInt();

        return new Student[size];
    }

    public Student[] fillStudentsArrayFromUserInput(Student[] students) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student information:");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Last Name: ");
            String lastName = scanner.next();
            System.out.print("First Name: ");
            String firstName = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            students[i] = new Student(lastName, firstName, age);
        }

        return students;
    }

    public void sortStudents(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getLastName().compareToIgnoreCase(s2.getLastName()));
    }

    public void printStudents(Student[] students) {
        System.out.println("Sorted list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
