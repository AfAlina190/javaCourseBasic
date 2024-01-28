package homeworkLesson9;

//        2. Перепишите решение задачи с использованием switch вместо if-else:

    import java.util.Scanner;


//        2. Перепишите решение задачи с использованием switch вместо if-else:
    public class Task1Switch {
        public static void main(String[] args) {
            // Создаем объект Scanner для считывания ввода пользователя
            Scanner scanner = new Scanner(System.in);

            // Выводим приглашение к вводу
            System.out.print("Введите число (1, 2 или 3): ");

            // Считываем введенное пользователем число
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();

                // Используем оператор switch для определения введенного числа
                switch (userNumber) {
                    case 1:
                        System.out.println("Вы ввели число 1.");
                        break;
                    case 2:
                        System.out.println("Вы ввели число 2.");
                        break;
                    case 3:
                        System.out.println("Вы ввели число 3.");
                        break;
                    default:
                        System.out.println("Вы ввели число, которое не является 1, 2 или 3.");
                }
            } else {
                System.out.println("Вы ввели не целое число. Пожалуйста, введите целое число.");
            }

            // Закрываем Scanner
            scanner.close();
        }
    }