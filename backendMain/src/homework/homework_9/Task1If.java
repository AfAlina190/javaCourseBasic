package homework.homework_9;

    import java.util.Scanner;

//    1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
//
//        2. Перепишите решение задачи с использованием switch вместо if-else:
//
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
    public class Task1If {
        public static void main(String[] args) {
            // Создаем объект Scanner для считывания ввода пользователя
            Scanner scanner = new Scanner(System.in);

            // Выводим приглашение к вводу
            System.out.print("Введите число (1, 2 или 3): ");

            // Считываем введенное пользователем число
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();

                // Проверяем, какое число ввел пользователь
                if (userNumber == 1) {
                    System.out.println("Вы ввели число 1.");
                } else if (userNumber == 2) {
                    System.out.println("Вы ввели число 2.");
                } else if (userNumber == 3) {
                    System.out.println("Вы ввели число 3.");
                } else {
                    System.out.println("Вы ввели число, которое не является 1, 2 или 3.");
                }
            } else {
                System.out.println("Вы ввели не целое число. Пожалуйста, введите целое число.");
            }

            // Закрываем Scanner
            scanner.close();
        }
    }

