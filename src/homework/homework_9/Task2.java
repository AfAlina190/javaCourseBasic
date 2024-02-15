package homework.homework_9;


//        - Запишите в 4 переменные случайные числа от 0 до 100
//        - Выведите все 4 на экран
//        - Программа должна определить максимальное из этих четырех чисел
//        - Результат вывести на экран

    import java.util.Random;

    public class Task2 {
        public static void main(String[] args) {
            // Создаем объект Random для генерации случайных чисел
            Random random = new Random();

            // Генерируем 4 случайных числа от 0 до 100
            int number1 = random.nextInt(101);
            int number2 = random.nextInt(101);
            int number3 = random.nextInt(101);
            int number4 = random.nextInt(101);

            // Выводим сгенерированные числа на экран
            System.out.println("Число 1: " + number1);
            System.out.println("Число 2: " + number2);
            System.out.println("Число 3: " + number3);
            System.out.println("Число 4: " + number4);

            // Находим максимальное число среди 4 сгенерированных
            int maxNumber = Math.max(Math.max(number1, number2), Math.max(number3, number4));

            // Выводим максимальное число на экран
            System.out.println("Максимальное число: " + maxNumber);
        }
    }
