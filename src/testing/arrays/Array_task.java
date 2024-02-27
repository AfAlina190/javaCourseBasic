package testing.arrays;

//Создайте массив, после чего найдите наибольший элемент массива
public class Array_task {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("---------------------------");

        int[] a = new int[] {20, 323, 44, 53};
        int max2 = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] > max2) {
                max2 = a[j];

            }
            System.out.println("Максимальный элемент массива: " + max2);
        }
    }

}
