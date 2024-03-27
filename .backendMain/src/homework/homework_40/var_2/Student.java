package homework.homework_40.var_2;



class Student {
    private String name;
    private int age;
    private double avgGrade;
    private int admissionYear;

    // Constructor and getters/setters

    public Student(String name, int age, double avgGrade, int admissionYear) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
        this.admissionYear = admissionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                ", admissionYear=" + admissionYear +
                '}';
    }
}

