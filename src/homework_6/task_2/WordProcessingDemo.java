package homework_6.task_2;
import java.util.Scanner;
public class WordProcessingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово: ");
        String secondWord = scanner.nextLine();

        String result = WordProcessor.processWords(firstWord, secondWord);

        System.out.println("Результат обработки: " + result);
    }
}
