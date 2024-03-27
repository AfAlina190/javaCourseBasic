package project.task_3;

public class TaskDemo {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Create tasks
        for (int i = 0; i < 5; i++) {
            Task task = taskManager.createTaskFromUserInput();
            taskManager.addTask(task);
        }

        // Print tasks before sorting
        System.out.println("Tasks before sorting:");
        taskManager.printTasks();

        // Sort tasks
        taskManager.sortTasks();

        // Print tasks after sorting
        System.out.println("Tasks after sorting:");
        taskManager.printTasks();
    }
}
