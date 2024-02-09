package homework_19;

//2. Напишите программу, которая определит, сколько слов Вы ввели с консоли.

import java.util.Scanner;
public class Task_2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите слова одной строкой через пробел");
            String input = scanner.nextLine();

            int count = 0;

            if(input.length() != 0){
                count++;

                for (int i = 0; i < input.length(); i++) {
                    if(input.charAt(i) == ' '){
                        count++;
                    }
                }
            }

            System.out.println("Вы ввели "+ count +" слов");
        }
    }
