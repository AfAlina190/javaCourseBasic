package homework.homework_9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести четырехзначное число
        System.out.print("Введите четырехзначное число: ");
        String input = scanner.nextLine();

        // Проверяем, является ли введенная строка числом и четырехзначной
        if (input.length() != 4 || !input.matches("\\d+")) {
            System.out.println("Ошибка! Введите четырехзначное число.");
            return;
        }

        // Преобразуем строку в массив символов для дальнейших вычислений
        char[] digits = input.toCharArray();

        // Вычисляем суммы первых двух и последних двух цифр
        int sumFirstTwo = Character.getNumericValue(digits[0]) + Character.getNumericValue(digits[1]);
        int sumLastTwo = Character.getNumericValue(digits[2]) + Character.getNumericValue(digits[3]);

        // Проверяем, является ли число "счастливым билетом"
        if (sumFirstTwo == sumLastTwo) {
            System.out.println("Число является счастливым билетом!");
        } else {
            System.out.println("Число НЕ является счастливым билетом.");
        }
    }
}

