public class SwapCallByValue {

    public static void swap(int a, int b) {
        // swap two vlaues
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);
        System.out.println(" a is: " + a);
        System.out.println("b is: " + b);

    }

}
