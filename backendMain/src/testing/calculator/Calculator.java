package testing.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 1 число: ");
        float num1 = scan.nextFloat();

        System.out.println("Введите 2 число ");
        float num2 = scan.nextFloat();

        float result1 = num1 + num2;
        float result2 = num1 - num2;
        float result3 = num1 * num2;
        float result4 = num1 / num2;
        float result5 = num1 % num2;

        System.out.println("Результат: ");
        System.out.println(result1 + "\n " + result2 + "\n " + result3 + "\n " + result4 + "\n " + result5);
        System.out.println("---------------------");
        System.out.println("Результат сложения: " + result1);
        System.out.println("Результат отнимания: " + result2);
        System.out.println("Результат умножения: " + result3);
        System.out.println("Результат деления: " + result4);
        System.out.println("Результат процент от остатка: " + result5);
    }
}
