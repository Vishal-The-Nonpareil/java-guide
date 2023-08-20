import java.util.Scanner;

public class exceptMultipleOf10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            int n = s.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);

        s.close();
    }

}