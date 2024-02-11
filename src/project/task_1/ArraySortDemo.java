package project.task_1;

public class ArraySortDemo {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.createArrayFromUserInput();
        array = arrayService.fillArrayFromUserInput(array);

        arrayService.sort(array);
        arrayService.printArray(array);
    }
}

