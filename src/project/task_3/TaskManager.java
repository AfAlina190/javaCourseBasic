package project.task_3;

import java.util.Arrays;
import java.util.Scanner;
class TaskManager {

        private Task[] tasks;
        private int taskCount;

        public TaskManager() {
            tasks = new Task[10];
            taskCount = 0;
        }

        public Task createTaskFromUserInput() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter task title:");
            String taskTitle = scanner.nextLine();

            System.out.println("Enter task description:");
            String taskDescription = scanner.nextLine();

            System.out.println("Enter priority (High, Medium, Low):");
            String priority = scanner.nextLine();

            // Assume status is always "New" when creating a task
            String status = "New";

            // Generate a unique ID for the task (You can implement your logic here)
            int id = taskCount + 1;

            return new Task(id, taskTitle, taskDescription, priority, status);
        }

        public void addTask(Task task) {
            if (taskCount < tasks.length) {
                tasks[taskCount++] = task;
                System.out.println("Task added successfully.");
            } else {
                System.out.println("Task list is full. Cannot add more tasks.");
            }
        }

        public void changeTaskStatus(int taskId, String newStatus) {
            for (Task task : tasks) {
                if (task != null && task.getId() == taskId) {
                    task.setStatus(newStatus);
                    System.out.println("Task status updated successfully.");
                    return;
                }
            }
            System.out.println("Task not found with ID: " + taskId);
        }

        public void printTasks() {
            for (Task task : tasks) {
                if (task != null) {
                    System.out.println(task);
                }
            }
        }

        public void sortTasks() {
            Arrays.sort(tasks, (task1, task2) -> {
                // Sort by priority
                int priorityComparison = task2.getPriority().compareTo(task1.getPriority());

                if (priorityComparison == 0) {
                    // If priorities are the same, sort by task title
                    return task1.getTaskTitle().compareTo(task2.getTaskTitle());
                }

                return priorityComparison;
            });
        }
}
