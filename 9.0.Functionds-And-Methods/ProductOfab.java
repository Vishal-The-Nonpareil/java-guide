public class ProductOfab {

    public static int product(int a, int b) {
        // product of a and b
        int prod = a * b;
        return prod;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int prod = product(a, b);
        System.out.println("product of a and b is : " + prod);
        prod = product(30, 5);
        System.out.println("a * b : " + prod);

    }

}