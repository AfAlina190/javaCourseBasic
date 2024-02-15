package homework.homework_9;

import java.util.Scanner;

    public class Task3 {
        public static void main(String[] args) {
            // Создаем объект Scanner для считывания ввода пользователя
            Scanner scanner = new Scanner(System.in);

            // Просим пользователя ввести число от 1 до 7
            System.out.println("Введите число от 1 до 7:");
            int dayOfWeek = scanner.nextInt();

            // Используем оператор switch для определения дня недели
            switch (dayOfWeek) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                case 7:
                    System.out.println("Выходной");
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }

            // Закрываем Scanner
            scanner.close();
        }
    }

//**Task 3** (Использовать оператор switch)
//
//        Программа просит пользователя ввести число от 1 до 7
//        Если число равно 1, выводим на консоль “Понедельник”, 2 – Вторник и так далее. Если 6 или 7 – “Выходной”.
