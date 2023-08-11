import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil, pen, eraser;
        System.out.println("Enter the price of pencil: ");
        pencil = sc.nextFloat();
        System.out.println("Enter the price of pen: ");
        pen = sc.nextFloat();
        System.out.println("Enter the price of eraser: ");
        eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;

        // Add on TotalBill with 18% tax:
        float TotalBill = (float) bill + (float) (bill * 0.18);
        System.out.println(TotalBill);

        sc.close();
    }
}