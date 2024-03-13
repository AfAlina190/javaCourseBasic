package homework.homework_38.task_2;

public class DemoCalcSumInteger {
    public static void main(String[] args) {

        CalcSumFI<Integer> integerCalcSumFI = ((num1, num2) ->
        {int sum = (num1 + num2);
            return sum;}
        );

        Integer integer1 = 10;
        Integer integer2 = 2;

        Integer sum = integerCalcSumFI.calculateSum(integer1,integer2);

        System.out.println("Сумма двух чисел "+integer1+" и "+integer2+" равняется: "+sum);

    }
}
