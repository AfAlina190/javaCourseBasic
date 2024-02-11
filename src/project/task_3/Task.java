package project.task_3;

public class Task {

        private int id;
        private String taskTitle;
        private String taskDescription;
        private String priority;
        private String status;

        public Task(int id, String taskTitle, String taskDescription, String priority, String status) {
            this.id = id;
            this.taskTitle = taskTitle;
            this.taskDescription = taskDescription;
            this.priority = priority;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public String getTaskTitle() {
            return taskTitle;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public String getPriority() {
            return priority;
        }

        public String getStatus() {
            return status;
        }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
        public String toString() {
            return "Task{" +
                    "id=" + id +
                    ", taskTitle='" + taskTitle + '\'' +
                    ", taskDescription='" + taskDescription + '\'' +
                    ", priority='" + priority + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

//Вариант 3.
//
//Задание: Создайте класс TaskManager для управления задачами.
//Включите в него метод createTaskFromUserInput, который позволяет
//пользователю ввести данные для создания новой задачи и возвращает
//объект Task.
//Класс Task имеет поля id, taskTitle, taskDescription, priority, status.
//
//Методы класса TaskManager должны позволять добавлять задачу,
//изменять ее статус и получать список задач.
//
//Реализуйте метод sort, который сортирует задачи в порядке приоритета - от важного до простого.
//Если задачи одного приоритета - то по алфавиту.
//
//Для реализации приложения реализуйте многоуровневый подход (хранение
//отдельных элементов, массивов и сервисные функции должны быть реализованы
//отдельно).
//
// Добавьте метод printTasks для вывода массива задач (печать по одному элементу).
//
// Реализуйте класс TaskDemo для демонстрации работы программы.