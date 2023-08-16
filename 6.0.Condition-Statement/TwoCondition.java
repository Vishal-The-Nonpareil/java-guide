public class TwoCondition {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Adult: drive, vote");
        } else {
            System.out.println("Not Adult");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("Not Adult");
        }
    }
}