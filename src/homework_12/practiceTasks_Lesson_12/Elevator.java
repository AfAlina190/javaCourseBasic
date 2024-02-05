package homework_12.practiceTasks_Lesson_12;

public class Elevator {
    public static void main(String[] args) {
        int up = 7;
        int down = 4;
        int totalFloors = 30;
        int currentFloor = 0;
        int iterations = 0;

        while (currentFloor < totalFloors) {
            currentFloor += up;

            if (currentFloor >= totalFloors) {
                break;
            }

            currentFloor -= down;
            iterations++;
        }

        System.out.println("Лифт поднимется на крышу за " + iterations + " итераций.");
    }
}
