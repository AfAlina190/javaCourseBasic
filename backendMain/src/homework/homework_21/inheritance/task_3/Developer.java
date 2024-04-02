package homework.homework_21.inheritance.task_3;

// Класс Developer, наследуемый от Employee
class Developer extends Employee {
    private String[] projects;

    public Developer(String name, int employeeId, double salary, String[] projects) {
        super(name, employeeId, salary);
        this.projects = projects;
    }

    // Геттер и сеттер для проектов
    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    // Другие методы, если необходимо
}
