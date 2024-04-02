package testing.calculator;

    import java.util.Scanner;

    public class TipCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the bill amount: ");
            double billAmount = scanner.nextDouble();
            int tipPercentage = 15;
            double tipAmount = billAmount * tipPercentage / 100;
            System.out.printf("The tip amount is %.2f", tipAmount);
        }
    }
