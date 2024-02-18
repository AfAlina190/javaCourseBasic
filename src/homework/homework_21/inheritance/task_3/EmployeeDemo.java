package homework.homework_21.inheritance.task_3;

import java.util.Arrays;

public class EmployeeDemo {
    public static void main(String[] args) {
        // Пример использования класса Employee
        Employee employee1 = new Employee("John Doe", 1, 50000);
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Salary: $" + employee1.getSalary());
        System.out.println();

        // Пример использования класса Manager
        Employee subordinate1 = new Employee("Alice", 2, 40000);
        Employee subordinate2 = new Employee("Bob", 3, 45000);
        Employee[] subordinates = {subordinate1, subordinate2};
        Manager manager = new Manager("Manager Smith", 4, 70000, subordinates);

        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager ID: " + manager.getEmployeeId());
        System.out.println("Manager Salary: $" + manager.getSalary());
        System.out.println("Subordinates:");
        for (Employee subordinate : manager.getSubordinates()) {
            System.out.println(subordinate.getName() + " - $" + subordinate.getSalary());
        }
        System.out.println();

        // Пример использования класса Developer
        String[] projects = {"Project A", "Project B", "Project C"};
        Developer developer = new Developer("Developer Johnson", 5, 60000, projects);

        System.out.println("Developer Name: " + developer.getName());
        System.out.println("Developer ID: " + developer.getEmployeeId());
        System.out.println("Developer Salary: $" + developer.getSalary());
        System.out.println("Projects:");
        System.out.println(Arrays.toString(developer.getProjects()));
    }
}
