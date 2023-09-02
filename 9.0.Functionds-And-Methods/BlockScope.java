public class BlockScope {
    public static void main(String[] args) {
        {
            int s = 56;
            System.out.println(s);
        }
        // System.out.println(s);
    }

}