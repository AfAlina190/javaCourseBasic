package homework.homework_40.var_1;

import java.util.ArrayList;
import java.util.List;


public class StudentListFilter {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kris",24,2.4));
        students.add(new Student("John",22,5.4));
        students.add(new Student("Alex",27,4.5));
        students.add(new Student("Kevin",24,3.4));
        students.add(new Student("Manfred",23,5.0));
        students.add(new Student("Leo",25,6.4));

        System.out.println(students);

        List<Student> studentFiltered = students.stream()
                .sorted((age1,age2) -> age1.getAge() - age2.getAge())
                .filter(avgGrade -> avgGrade.getAvgGrade() > 4.5)
                .toList();
        System.out.println("Students sorted by age (in ascending order) & with average Grade > 4.5: " + studentFiltered);
        System.out.println();

        System.out.println("Students sorted by age (in descending order) & with average Grade > 4.5: " );
        students.stream()
                .sorted((age1,age2) -> age2.getAge() - age1.getAge())
                .filter(avgGrade -> avgGrade.getAvgGrade() > 4.5)
                .forEach(elem -> System.out.print(elem + " / "));
    }
}
