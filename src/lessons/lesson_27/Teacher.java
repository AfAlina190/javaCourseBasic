package lessons.lesson_27;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private int teacherId;
    private String name;
    private List<Course> courses;

    public Teacher(int teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void teachCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                '}';
    }
}