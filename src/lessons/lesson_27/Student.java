package lessons.lesson_27;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentId;
    private String name;
    private List<Course> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}








