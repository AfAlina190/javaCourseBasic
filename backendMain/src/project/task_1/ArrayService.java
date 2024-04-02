package project.task_1;

import java.util.Arrays;
import java.util.Scanner;

class ArrayService {
    public int[] createArrayFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        return new int[size];
    }

    public int[] fillArrayFromUserInput(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void sort(int[] array) {
        Arrays.sort(array);
        reverseArray(array);
    }

    private void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;


            left++;
            right--;
        }
    }

    public void printArray(int[] array) {
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(array));
    }
}

//Вариант 1.
//
//Задание: Создайте класс ArrayService, содержащий метод sort,
//который принимает массив целых чисел и сортирует его по убыванию.
//
//Добавьте метод createArrayFromUserInput для чтения размера
//массива и его создания.
//
//Добавьте метод fillArrayFromUserInput для заполнения
//массива элементами от пользователя, возвращая созданный
//массив как ссылку.
//
//Добавьте метод printArray для вывода отсортированного массива.
//
//Реализуйте класс ArraySortDemo для демонстрации работы программы.
