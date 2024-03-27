package lessons.lesson_27;

import java.util.List;

public class TaskDemo {
    public static void main(String[] args) {
        EducationalManagement management = new EducationalManagement();

        Department computerScienceDepartment = new Department("Компьютерные науки");
        management.addDepartment(computerScienceDepartment);

        Teacher javaTeacher = new Teacher(1, "Иванова Мария Петровна ");
        management.addTeacher(javaTeacher);
        Teacher javaTeacher1 = new Teacher(2, "Петров Петр Иванович ");
        management.addTeacher(javaTeacher1);

        Course javaCourse = new Course(101, "Java Programming", javaTeacher, computerScienceDepartment);
        management.addCourse(javaCourse);

        Student student1 = new Student(1001, "Яна Петрова");
        management.addStudent(student1);

        Student student2 = new Student(1002, "Игорь Пашков");
        management.addStudent(student2);

        management.assignStudentToCourse(student1, javaCourse);
        management.assignStudentToCourse(student2, javaCourse);

        management.assignCourseToTeacher(javaCourse, javaTeacher);

        System.out.println("Студенты АIT:");
        List<Student> studentsOnJavaCourse = management.getStudentsOnCourse(javaCourse);
        for (Student student : studentsOnJavaCourse) {
            System.out.println(student);
        }

        System.out.println("\nКурсы проводимые преподователем по JAVA:");
        List<Course> coursesByJavaTeacher = management.getCoursesByTeacher(javaTeacher);
        for (Course course : coursesByJavaTeacher) {
            System.out.println(course);
        }
    }
}


