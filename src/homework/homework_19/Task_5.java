package homework.homework_19;

import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;
//Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
//   Введенное пользователем число сохраняется в переменную n.
//   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//   Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//   Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Task_5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n;
            do {
                System.out.println("Введите размер массива (натуральное число больше 3): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Некорректный ввод. Введите целое число: ");
                    scanner.next();
                }
                n = scanner.nextInt();
            } while (n <= 3);

            int[] array = new Random().ints(n, 0, n + 1).toArray();
            System.out.println("Исходный массив: " + Arrays.toString(array));

            int[] evenNumbersArray = Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
            System.out.println("Массив из чётных элементов: " + Arrays.toString(evenNumbersArray));
        }
    }

//
//        public static void main(String[] args){
//
//            int n=0,c=0;
//            do{
//                Scanner scn = new Scanner(System.in);
//                System.out.println("Введите число большее 3");
//                if(scn.hasNextInt()){
//                    n=scn.nextInt();
//                }
//                else System.out.println("Ошибка. Вы ввели не число!");
//            }
//            while (n<4);
//
//            int[] Mas1 = new int[n];
//            for(int i=0;i<Mas1.length;i++){
//                Mas1[i]=(int)(Math.random()*(n+1));
//                System.out.print(Mas1[i]+" ");
//
//                if(Mas1[i]%2==0&Mas1[i]!=0)c++;
//            }
//            System.out.println("");
//
//            if(c>0){
//                int[] Mas2 = new int[c];
//                for(int i=0,b=0;i<Mas1.length;i++){
//                    if (Mas1[i]%2==0&Mas1[i]!=0){
//                        Mas2[b]=Mas1[i];
//                        System.out.print(Mas2[b]+" ");
//                    }
//                }
//            }
//        }

