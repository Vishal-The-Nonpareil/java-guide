public class ContinueStatement {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

}