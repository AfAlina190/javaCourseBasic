package project.task_2;

public class StudentsSortDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student[] students = studentService.createStudentsArrayFromUserInput();
        students = studentService.fillStudentsArrayFromUserInput(students);


        studentService.sortStudents(students);
        studentService.printStudents(students);
    }
}