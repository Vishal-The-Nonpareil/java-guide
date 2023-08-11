import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Formula Area = pie r*r

        System.out.println("Enter the radius: ");
        float radius = sc.nextInt();

        // Java used to take all dedcimal values store in double
        // To declared the float value, we use 'f' after value.
        float Area = 3.14f * radius * radius;
        System.out.println(Area);

        sc.close();
    }
}
