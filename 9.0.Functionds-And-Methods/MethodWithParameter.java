import java.util.Scanner;

public class MethodWithParameter {

    public static void calSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        calSum();
    }

}
