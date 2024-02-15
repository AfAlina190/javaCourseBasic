package homework.homework_4;

public class NumberOperations {
    public static void main(String[] args) {

        showRemainders(10, 2);

        showRemainders(10, 3);
    }
    public static void showRemainders(int range, int divisor) {
        System.out.println("Числа, остаток от деления на " + divisor + ":");
        for (int i = 0; i <= range; i++) {
            if (i % divisor == 0) {
                System.out.println(i + " % " + divisor + " = " + i % divisor);
            }
        }
        System.out.println();
    }
}


