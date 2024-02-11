package homework_18.task_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int size = arrayProcessor.getUserArraySize();

        int[] array = arrayProcessor.generateRandomArray(size);

        System.out.println("Массив: " + Arrays.toString(array));

        int[] maxIndexes = arrayProcessor.findMaxAndIndexes(array);
        System.out.println("Максимальный элемент: " + maxIndexes[0]);
        System.out.println("Индекс(ы) максимального элемента: " + Arrays.toString(Arrays.copyOfRange(maxIndexes, 1, maxIndexes.length)));

        int sum = arrayProcessor.calculateSum(array);
        System.out.println("Сумма всех элементов: " + sum);
    }
}

