package testing.conditional_constructions;

import java.util.Scanner;
public class Calculator_cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число:");
        int number2 = scanner.nextInt();

        int result;

        System.out.println("Действие");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                result = number1 + number2;
                System.out.println("Результат: " + number1 + " + " + number2 + " = " + result);
                System.out.println("*****************************************");
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

                break;
            case "-":
                result = number1 - number2;
                System.out.println("Результат: " + number1 + " - " + number2 + " = " + result);
                System.out.println("*****************************************");
                System.out.println("Результат: " + number1 + " - " + number2 + " = " + (number1 - number2));

                break;
            case "*":
                result = number1 * number2;
                System.out.println("Результат: " + number1 + " * " + number2 + " = " + result);
                System.out.println("*****************************************");
                System.out.println("Результат: " + number1 + " * " + number2 + " = " + (number1 * number2));

                break;
            case "/":
                result = number1 / number2;
                if (number2 == 0 || number1 == 0) {
                    System.out.println("Деление на 0!");
                } else {
                    System.out.println("Результат: " + number1 + " / " + number2 + " = " + result);
                    System.out.println("*****************************************");
                System.out.println("Результат: " + number1 + " / " + number2 + " = " + (number1 / number2));}
                break;
                default:
                    System.out.println("Вы что то не ввели!");

        }
    }
}
