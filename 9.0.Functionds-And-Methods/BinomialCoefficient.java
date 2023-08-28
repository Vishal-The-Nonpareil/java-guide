public class BinomialCoefficient {

    public static int factorial(int n) {
        // factorial methodd
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f; // f is factorial of n
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = n_fact / (r_fact * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {

        System.out.println(binCoeff(5, 2));

    }
}