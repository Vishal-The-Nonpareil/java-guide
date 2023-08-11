import java.util.*;

public class Prodduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println(product);
        sc.close();
    }

}
