package homework_19;

//Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//   Отсортируйте массив по убыванию любым из алгоритмов.

import java.util.Random;
public class Task_3 {

        public static void main(String[] args) {
            int[] array = new int[8];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10) + 1;
            }

            System.out.println("Исходный массив:");
            printArray(array);

            bubbleSortDescending(array);

            System.out.println("Массив после сортировки по убыванию:");
            printArray(array);
        }

        public static void bubbleSortDescending(int[] arr) {
            int n = arr.length;
            boolean swapped;

            do {
                swapped = false;

                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] < arr[i]) {

                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                    }
                }

                n--;

            } while (swapped);
        }

        public static void printArray(int[] arr) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
