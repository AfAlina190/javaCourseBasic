package homework_18.task_1;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("Missing number in arr1: " + findMissingNumber(arr1));
        System.out.println("Missing number in arr2: " + findMissingNumber(arr2));
    }

    static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;

        // Рассчитываем сумму арифметической прогрессии от 1 до n
        int expectedSum = n * (n + 1) / 2;

        // Рассчитываем сумму элементов массива
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Разница между ожидаемой и фактической суммой будет недостающим элементом
        return expectedSum - actualSum;
    }
}
