package lessons.lesson_32.task_1;

import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        String expression1 = "(){}[]";
        String expression2 = "({})";
        String expression3 = "{[]([])}";
        String expression4 = "{[]([)])}";

        System.out.println(checkBrackets(expression1)); // true
        System.out.println(checkBrackets(expression2)); // true
        System.out.println(checkBrackets(expression3)); // true
        System.out.println(checkBrackets(expression4)); // false
    }

    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Несоответствие скобок
            }
        }

        return stack.isEmpty(); // Стек должен быть пустым для правильной последовательности
    }
}
