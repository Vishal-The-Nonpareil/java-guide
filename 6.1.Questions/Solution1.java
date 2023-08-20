import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ans = (n > 0) ? n + " is greater than 0" : n + " is less than or equal 0";
        System.out.println(ans);

        sc.close();
    }
}