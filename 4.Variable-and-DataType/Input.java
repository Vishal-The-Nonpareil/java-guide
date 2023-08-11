import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input first name
        String name = sc.next();
        System.out.println(name);

        // input Full name
        String FullName = sc.nextLine();
        System.out.println(FullName);

        // input integer
        int number = sc.nextInt();
        System.out.println(number);

        // input float value
        float price = sc.nextFloat();
        System.out.println(price);

        sc.close();
    }

}
