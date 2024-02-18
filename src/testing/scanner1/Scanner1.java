package testing.scanner1;

import java.util.Scanner;
public class Scanner1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Введите Ваше имя: ");
//        String userName = scan.nextLine();
//        System.out.println("Введите Вашу фамилию: ");
//        String userSecName = scan.nextLine();
//        System.out.println("Спасибо " +userName + " " + userSecName);

//        int num1 = scan.nextInt();
//        byte num2 = scan.nextByte();
//        boolean found = scan.nextBoolean();
//        float num3 = scan.nextFloat();

        short num4 = 50, num5 = 40;
        int num6 = num4 + num5;
        System.out.println("Результат: " +num6);

        float num7 = 50, num8 = 12;
        float num9 = num7 % num8;
        System.out.println("Результат №1: " +num9);
        num9 += 6;
        System.out.println("Результат №2: " +num9);

        System.out.println("-------------------------------------------------------");

        float num10 = 10, num11 = 13;
        float res = num10 * num11;
        System.out.println("Результат №1: " +res);
        res ++ ;
        System.out.println("Результат №2: " +res);


    }
}
