package homework_10;

public class Task3Factorial {
    public static void main(String[] args) {
        Factorial factCalc = new Factorial();

        int n = 10;

        System.out.println("Значение факториала для числа " + n + " равно " + factCalc.factorial(n));
    }
}
