package homework_18.task_3;

public class EvenNumberCounter {
    public static int countEvenNumbers(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

