package lessons.lesson_12;


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
