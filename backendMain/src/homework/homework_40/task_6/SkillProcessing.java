package homework.homework_40.task_6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SkillProcessing {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 30, Arrays.asList("Java", "Python", "SQL")),
                new Person("Alex", 22, Arrays.asList("JavaScript", "HTML", "CSS")),
                new Person("Lis", 28, Arrays.asList("Java", "C++", "Python"))
        );

        Set<String> uniqueSkills = persons.stream()
                .filter(person -> person.age > 25)
                .flatMap(person -> person.skills.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toSet());

        System.out.println("Уникальные навыки людей старше 25 лет: " + uniqueSkills);
    }
}
