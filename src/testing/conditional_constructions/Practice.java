package testing.conditional_constructions;

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
//        условные конструкции if = else
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("12345")) {
            System.out.println("Добро пожаловать!");
        }
        if (role.equals("Admin")) {
//            if (role == "Admin"){}
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет как тебя зовут?");
            String name = scanner.nextLine();

        }

    }
}
