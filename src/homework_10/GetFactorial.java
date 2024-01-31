package homework_10;

// Задание 3.
//Написать метод для вычисления факториала числа (произведение всех чисел от 1 до заданного)
// Practice Task 3
public class GetFactorial {
public static void main(String[] args) {

    System.out.println(ToGetFactorial(6) - ToGetFactorial(4));
}

    public static int ToGetFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
