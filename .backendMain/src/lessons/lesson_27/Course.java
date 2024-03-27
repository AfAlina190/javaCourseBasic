package lessons.lesson_27;

import java.util.ArrayList;
import java.util.List;

class Course {
    private int courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;
    private Department department;

    public Course(int courseId, String courseName, Teacher teacher, Department department) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.department = department;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Department getDepartment() {
        return department;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}