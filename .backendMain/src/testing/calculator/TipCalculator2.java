package testing.calculator;

    import java.util.Scanner;

    public class TipCalculator2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите сумму счета: ");
            double billAmount = scanner.nextDouble();
            int tipPercentage = 15;
            double tipAmount = billAmount * tipPercentage / 100;
            System.out.printf("Размер чаевых составляет %.2f", tipAmount);
        }
    }

