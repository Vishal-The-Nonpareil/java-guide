public class OverloadingUsingPara {

    // function to calculate sum of 2 num
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of 3 num
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(3, 5, 5));
        System.out.println(sum(4, 6));

    }
}