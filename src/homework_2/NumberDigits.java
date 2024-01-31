package homework_2;

public class NumberDigits {
    public static void main(String[] args) {

        int number = 345;

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        System.out.println("Число " + number + " -> " + digit1 + ", " + digit2 + ", " + digit3);
    }
}

