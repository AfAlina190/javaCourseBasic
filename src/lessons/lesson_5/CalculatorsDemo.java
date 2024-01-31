package lessons.lesson_5;

public class CalculatorsDemo {
    public static void main(String[] args) {
        CalculatorVoid calculatorVoid = new CalculatorVoid();

        System.out.println("Результат работы метода : " + calculatorVoid.result);


        // ----- Используем метод, который будет ВОЗВРАЩАТЬ значение результата своей работы -----

        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();

        int k = 10;
        int l = 12;

        int resultFromMethod = calculatorWithReturnResult.sum(k,l);

        System.out.println("Результат сложения x = " + k + " и у = " + l + " будет равен: " + resultFromMethod);

    }
    }
