package homework.homework_11;

import lessons.lesson_6.scanner.UserInput;

public class Task2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        SimpleNumber simpleNumber = new SimpleNumber();

        int userInt = userInput.inputInteger("Please enter integer number: ");

        boolean isSimple = simpleNumber.isSimple(userInt);

        if (isSimple) {
            System.out.println("Число " + userInt + " является простым");
        } else {
            System.out.println("Число " + userInt + " не является простым");
        }

    }

}
