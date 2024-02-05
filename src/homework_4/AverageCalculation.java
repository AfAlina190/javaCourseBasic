package homework_4;

public class AverageCalculation {
    public static void main(String[] args) {

    int num1 = 0, num2 = 1, num3 = 2, num4 = 3, num5 = 4, num6 = 5, num7 = 6, num8 = 7, num9 = 8, num10 = 9;

    int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

    int average = sum / 10;

    System.out.println("Среднее арифметическое: " + average);

    int remainder = sum % 10;

        System.out.println("Отброшено в дробной части: " + remainder);
}
}
//адача 2. Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10. Получается, у вас будет среднее арифметическое этих чисел в одной переменной. Распечатайте её через println. Сколько программа отбросила в дробной части?
