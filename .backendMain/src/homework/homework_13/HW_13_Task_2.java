package homework.homework_13;

import java.util.Arrays;
import java.util.Random;

public class HW_13_Task_2{

    public static void main(String[] args) {

        int[] array = generateRandomArray(5, 10, 99);

        System.out.println("Создан массив: " + Arrays.toString(array));

        boolean isIncreasing = isStrictlyIncreasing(array);

        System.out.println("Является ли массив строго возрастающей последовательностью? - " + isIncreasing);
    }

    private static int[] generateRandomArray(int length, int min, int max) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    private static boolean isStrictlyIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
    }

//