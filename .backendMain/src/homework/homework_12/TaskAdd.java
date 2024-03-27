package homework.homework_12;

import java.util.Scanner;
public class TaskAdd {
//Напечатать все простые числа от 2 до 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();

        System.out.println("Спасибо! Вы ввели число " + number);

            SimpleNumber simpleNumber = new SimpleNumber();

            for (int i = 2; i < 100; i++) {
                if (simpleNumber.isSimple(i)) {
                    System.out.println("Число " + i + " простое");
                }
            }
        }
    }

