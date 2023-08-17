public class PrintLargestOf3 {
    public static void main(String[] args) {

        int A = 1;
        int B = 3;
        int C = 6;

        if ((A >= B) && (A >= C)) {
            System.out.println("A is the largest of three ");
        } else if (B >= C) {
            System.out.println("B is the largest of three");

        } else {
            System.out.println("C is thhe largest of three");
        }
    }
}
