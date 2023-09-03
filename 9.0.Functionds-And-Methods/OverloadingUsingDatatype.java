public class OverloadingUsingDatatype {

    // function to calculate int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to claculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 6));
        System.out.println(sum(2.2f, 6.4f));

    }

}
