package homework.homework_41.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupingAndCount {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Sales"));
        employees.add(new Employee("Alice", "Marketing"));
        employees.add(new Employee("David", "Sales"));
        employees.add(new Employee("Emma", "Marketing"));
        employees.add(new Employee("Michael", "Sales"));

        Map<String, Long> departmentCount = groupAndCountEmployees(employees);
        System.out.println(departmentCount);
    }

    public static Map<String, Long> groupAndCountEmployees(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }
}

