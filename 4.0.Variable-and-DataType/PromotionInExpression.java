public class PromotionInExpression {
    public static void main(String[] args) {
        short a = 5;
        byte b = 25;
        char c = 'c';
        // byte bt = a + b + c; ----> error
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

        int a1 = 10;
        float b1 = 20.25f;
        long c1 = 25;
        double d = 30;
        double ans = a1 + b1 + c1 + d;
        System.out.println(ans);

    }
}