import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // String ans = (year % 4 == 0) ? year + " Leap year" : year + " is not a leap
        // year";
        // System.out.println(ans);

        // if (year % 4 == 0) {
        // System.out.println(year + " is leap year");
        // } else {
        // System.out.println(year + " is not a leap year");

        // }

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leapyear");
        }
        sc.close();
    }

}
