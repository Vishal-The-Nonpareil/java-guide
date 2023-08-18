import java.util.*;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();

        // Ternary operator
        String Result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println("You are " + Result);
    }
}