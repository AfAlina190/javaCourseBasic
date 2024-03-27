package homework.homework_18.task_7;

import java.util.Random;
import java.util.Scanner;

class ArrayProcessor {
    public int getUserArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        return scanner.nextInt();
    }

    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public int[] findMaxAndIndexes(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
                count = 1;
            } else if (array[i] == max) {
                count++;
            }
        }

        int[] result = new int[count + 1];
        result[0] = max;

        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                result[index++] = i;
            }
        }

        return result;
    }

    public int calculateSum(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum;
    }
}
