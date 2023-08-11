import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        c = sc.nextInt();

        float average = (float) (a + b + c) / 3;
        System.out.println(average);

        sc.close();
    }
}