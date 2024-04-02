package project.task_2;


class Student {
    private String lastName;
    private String firstName;
    private int age;

    public Student(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}


//Вариант 2.
//
//Задание: Разработайте класс StudentService для управления
//списком студентов.
//
//Добавьте метод createStudentsArrayFromUserInput для чтения размера
//массива и его создания.
//Метод должен возвратить созданный массив как ссылку.
//
//Добавьте метод fillStudentsArrayFromUserInput для заполнения
//массива элементами Student.
//
//Добавьте метод createStudentFromUserInput для создания
//нового объекта Student на основе данных, введенных пользователем.
//Класс Student должен содержать основные атрибуты, такие как Фамилия, имя и возраст.
//
//Добавьте метод sortStudents, который сортирует массив студентов
//по алфавиту по полю Фамилия.
//
//Добавьте метод printStudents для вывода массива студентов (печать по одному элементу).
//
//Реализуйте класс StudentsSortDemo для демонстрации работы программы.

