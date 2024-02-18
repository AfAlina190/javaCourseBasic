package testing.conditional_constructions;

import java.util.Scanner;

public class PracticeSw {
    public static void main(String[] args) {
//        условные конструкции switch-case
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
