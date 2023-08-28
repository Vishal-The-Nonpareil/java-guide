import java.util.Scanner;

public class AtmTransation {

    public static int atmTrans(int wdraw, int bal) {
        // int wdraw, bal;
        int tran = bal - wdraw;
        return tran;
    }

    public static void multiple500(int wdraw, int trans) {
        if (wdraw % 500 == 0) {
            System.out.println("Your current balance is: " + trans);

        } else {
            System.out.println("Please enter the ammount of multiple of 500: ");
        }
    }

    public static void main(String[] args) {

        int pin = 1007;
        int bal = 100000;
        int wdraw;
        // int trans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin : ");
        int pinAtm = sc.nextInt();
        if (pinAtm == 1007) {
            System.out.println(" Enter Withdraw ammount in multiple of 500 : ");
            wdraw = sc.nextInt();
            trans = atmTrans(wdraw, bal);
        } else {
            System.out.println("The pin you have entered is incorrect, please enter correct pin ");

        }

        // multiple of 500 condition
        multiple500();

        sc.close();

    }

}
