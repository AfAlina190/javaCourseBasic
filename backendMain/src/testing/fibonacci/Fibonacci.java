package testing.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("fibNaive: " + fibNaive(3));
        System.out.println("fibNaive: " + fibNaive(5));
        System.out.println("fibNaive: " + fibNaive(10));
        System.out.println("fibNaive: " + fibNaive(20));
        System.out.println("================================");
        System.out.println("fibEffective:  " + fibEffective(100));

    }

    //    наивный медленный очевидный
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibEffective(int n) {
        long [] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }
}

