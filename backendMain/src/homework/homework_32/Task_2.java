package homework.homework_32;

import java.util.LinkedList;
import java.util.Queue;

public class Task_2 {

    public static void rotateQueue(Queue<Integer> queue, int k) {
        // Проверяем, что очередь не пуста и k неотрицательно
        if (!queue.isEmpty() && k >= 0) {
            k = k % queue.size(); // Нормализуем k, чтобы избежать лишних повторений

            // Выполняем k ротаций
            for (int i = 0; i < k; i++) {
                int front = queue.poll(); // Извлекаем элемент из начала очереди
                queue.offer(front); // Помещаем извлеченный элемент в конец очереди
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
        }

        System.out.println("Исходная очередь: " + queue);

        int rotations = 2;
        rotateQueue(queue, rotations);

        System.out.println("Очередь после " + rotations + " ротаций: " + queue);
    }
}
