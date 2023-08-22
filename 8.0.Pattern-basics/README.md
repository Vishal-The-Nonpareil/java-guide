# Pattern

## Print Star Pattern

1. No. or lines

   a. outer loop --> 5 times

2. Number of times (i)

   b. inner loop (i times)

3. What to print?

   c. "\*"

```
public class PrintStarPattern {
    public static void main(String[] args) {

        for (int line = 1; line <= 5; line++) {

            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

#### Output:

```
*
**
***
****
*****
```
