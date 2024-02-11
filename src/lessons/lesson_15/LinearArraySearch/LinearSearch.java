package lessons.lesson_15.LinearArraySearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Возвращаем индекс найденного элемента
            }
        }
        return -1; // Элемент не найден
    }

    public static void main(String[] args) {
        int[] arr = {3, 45, 1, 2, 8, 19}; // Пример массива
        int target = 8; // Элемент, который мы хотим найти

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Элемент не найден в массиве.");
        } else {
            System.out.println("Элемент найден на позиции: " + result);
        }
    }
}
