package lessons.lesson_27;

import java.util.ArrayList;
import java.util.List;

class EducationalManagement {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Department> departments;

    public EducationalManagement() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void assignStudentToCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            student.enrollInCourse(course);
            course.addStudent(student);
        }
    }

    public void assignCourseToTeacher(Course course, Teacher teacher) {
        if (courses.contains(course) && teachers.contains(teacher)) {
            teacher.teachCourse(course);
        }
    }

    public List<Student> getStudentsOnCourse(Course course) {
        return course.getStudents();
    }

    public List<Course> getCoursesByTeacher(Teacher teacher) {
        return teacher.getCourses();
    }
}


