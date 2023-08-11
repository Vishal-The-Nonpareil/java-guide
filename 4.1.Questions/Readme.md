# Variable And Data Type Questions:

## 1. In a program, input 3 numbers: A B C you have to output the average of these 3 no. (Hint Average of N no. is sum of those numbers divided by N)

## 2. In a program,input the side of a square.You have to output the area of the square. (Hint : area of a square is (side x side))

## 3. Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

## 4. What will be the type of result in the following Java code? (Hint : Look at the largest data type among these)

```
byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;

result = (f * b) + (i % c) - (d * s);
```

## 4. Will the following statementgive any error in Java? int $ = 24;

---

### **Soltion1:**

```
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        c = sc.nextInt();

        float average = (float) (a + b + c) / 3;
        System.out.println(average);

        sc.close();
    }
}
```

### **Solution2:**

```
import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square is: " + area);

        sc.close();
    }

}
```

### **Solution3:**

```
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
```

### **Solution4:**

- [] int
- [] float
- [] byte
- [x] double

### **Solution5:**

> No, the statement will not give any error.Names of variables are called identifiers in Java.Identifier rule says,identifiers can start with any alphabet or underscore (“\_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.
