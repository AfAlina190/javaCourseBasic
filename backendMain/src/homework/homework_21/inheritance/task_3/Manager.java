package homework.homework_21.inheritance.task_3;

// Класс Manager, наследуемый от Employee
class Manager extends Employee {
    private Employee[] subordinates;

    public Manager(String name, int employeeId, double salary, Employee[] subordinates) {
        super(name, employeeId, salary);
        this.subordinates = subordinates;
    }

    // Геттер и сеттер для подчиненных
    public Employee[] getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Employee[] subordinates) {
        this.subordinates = subordinates;
    }

    // Другие методы, если необходимо
}