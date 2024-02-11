package homework_18.task_2;

public class OddNumbersArray {
    public static void main(String[] args) {

        int[] oddNumbers = generateOddNumbersArray();

        printArrayReverse(oddNumbers);
    }

    static int[] generateOddNumbersArray() {
        int size = 50;
        int[] oddNumbers = new int[size];
        int value = 1;

        for (int i = 0; i < size; i++) {
            oddNumbers[i] = value;
            value += 2;
        }

        return oddNumbers;
    }

    static void printArrayReverse(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
