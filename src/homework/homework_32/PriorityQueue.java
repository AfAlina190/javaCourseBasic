package homework.homework_32;

import java.util.LinkedList;

public class PriorityQueue<T> {

    private LinkedList<PriorityNode<T>> queue;

    public PriorityQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element, int priority) {
        PriorityNode<T> newNode = new PriorityNode<>(element, priority);

        // Находим место для вставки элемента в соответствии с приоритетом
        int index = 0;
        while (index < queue.size() && priority >= queue.get(index).priority) {
            index++;
        }
        queue.add(index, newNode);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst().element;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    private static class PriorityNode<T> {
        private T element;
        private int priority;

        public PriorityNode(T element, int priority) {
            this.element = element;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.enqueue("Task A", 2);
        priorityQueue.enqueue("Task B", 1);
        priorityQueue.enqueue("Task C", 3);

        System.out.println("Dequeue: " + priorityQueue.dequeue()); // Task C
        System.out.println("Dequeue: " + priorityQueue.dequeue()); // Task A
        System.out.println("Dequeue: " + priorityQueue.dequeue()); // Task B
    }
}
