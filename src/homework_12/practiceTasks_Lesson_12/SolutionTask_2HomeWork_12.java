package homework_12.practiceTasks_Lesson_12;
import java.util.Scanner;
public class SolutionTask_2HomeWork_12 {
//
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите ваши числа: ");

            int sum = 0;
            int number;

            while (true) {
                number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                sum += number;
            }

            System.out.println("Сумма введенных вами чисел: " + sum);
            System.out.println("Среднее арифметическое: " + (double) sum / number);
        }
    }
