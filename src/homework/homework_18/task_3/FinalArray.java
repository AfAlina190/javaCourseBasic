package homework.homework_18.task_3;

public class FinalArray {
    public static void main(String[] args) {

        int[] array = RandomArrayGenerator.generateRandomArray(15, 0, 9);


        System.out.println("Массив:");
        ArrayPrinter.printArray(array);

        int evenCount = EvenNumberCounter.countEvenNumbers(array);


        System.out.println("Количество четных элементов: " + evenCount);
    }
}
