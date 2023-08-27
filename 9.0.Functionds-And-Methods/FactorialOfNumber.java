public class FactorialOfNumber {

    public static int factorial(int n) {
        // factorial methodd
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f; // f is factorial of n
    }

    public static void main(String[] args) {

        System.out.println(factorial(3));
    }

}
