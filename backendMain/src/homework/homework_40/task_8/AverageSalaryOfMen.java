package homework.homework_40.task_8;

import java.util.Arrays;
import java.util.List;

public class AverageSalaryOfMen {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 30, "Male", 50000.0),
                new Person("Alice", 28, "Female", 60000.0),
                new Person("Bob", 35, "Male", 75000.0),
                new Person("Eve", 22, "Female", 55000.0),
                new Person("Charlie", 40, "Male", 80000.0)
        );

        double averageSalaryOfMen = persons.stream()
                .filter(person -> person.gender.equals("Male"))
                .filter(person -> person.age >= 25 && person.age <= 40)
                .mapToDouble(person -> person.salary)
                .average()
                .orElse(0.0);

        System.out.println("Average salary of men aged 25 to 40: " + averageSalaryOfMen);
    }
}

