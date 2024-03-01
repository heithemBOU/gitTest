package wissemBoumahdef;

public class WissemBoumahdef {

    public static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
