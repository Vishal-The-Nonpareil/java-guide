public class BlockScope {
    public static void main(String[] args) {

        int p = 76; // Function Scope
        {
            int s = 56;
            System.out.println(s); // Block Scope
            System.out.println(p);
        }
        // System.out.println(s);
        System.out.println(p);
    }

}
