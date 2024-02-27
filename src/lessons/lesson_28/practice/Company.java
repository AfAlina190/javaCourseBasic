package lessons.lesson_28.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    public static void main(String[] args) {
        // 1) Создаем коллекцию для хранения данных о сотрудниках в компании
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Alice"));
        employees.add(new Employee(3, "Bob"));
        employees.add(new Employee(4, "Eva"));
        employees.add(new Employee(5, "Charlie"));

        // 2) Создаем два отдела и распределяем сотрудников по отделам
        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(employees.get(0));
        hrDepartment.addEmployee(employees.get(1));

        Department itDepartment = new Department("IT");
        itDepartment.addEmployee(employees.get(2));
        itDepartment.addEmployee(employees.get(3));
        itDepartment.addEmployee(employees.get(4));

        // 3) Создаем коллекцию по отделам и сотрудникам в каждом отделе
        Map<Department, List<Employee>> departmentEmployees = new HashMap<>();
        departmentEmployees.put(hrDepartment, hrDepartment.getEmployees());
        departmentEmployees.put(itDepartment, itDepartment.getEmployees());

        // 4) Создаем коллекцию всех отделов
        List<Department> departments = new ArrayList<>();
        departments.add(hrDepartment);
        departments.add(itDepartment);

        // Выводим результат
        System.out.println("Employees: " + employees);
        System.out.println("Department Employees: " + departmentEmployees);
        System.out.println("All Departments: " + departments);
    }
}
