package homework.homework_32;

import java.util.Stack;

public class Task_1 {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Извлекаем верхний элемент стека
            int temp = stack.pop();

            // Рекурсивно вызываем sortStack для оставшихся элементов
            sortStack(stack);

            // Вставляем элемент в правильное место в стеке
            insertSorted(stack, temp);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int value) {
        // Если стек пуст или верхний элемент стека меньше value, просто вставляем value
        if (stack.isEmpty() || stack.peek() < value) {
            stack.push(value);
        } else {
            // Иначе извлекаем верхний элемент, рекурсивно вызываем insertSorted,
            // и вставляем верхний элемент обратно
            int temp = stack.pop();
            insertSorted(stack, value);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Исходный стек: " + stack);

        sortStack(stack);

        System.out.println("Отсортированный стек: " + stack);
    }
}
