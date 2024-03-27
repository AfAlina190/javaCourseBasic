package testing.loops;

public class Main {
    public static void main(String[] args) {
        //    Циклы
        for (int i = 0; i <= 10; i++) {
            System.out.println("Индекс i = " + i);
        }
        System.out.println("==========================");

        for (double i = 100; i > 10; i /= 2) {
            System.out.println("Element: " + i);
        }
        System.out.println("________________________");

        int i = 100;
        while (i >= 10) {
            System.out.println("Element while: " + i);
            i -= 25;

            break;
        }

        System.out.println("++++++++++++++");

        int j = 0;
        do {
            System.out.println("Element do: " + j);
            j++;
        } while (j < 10);


    }
}