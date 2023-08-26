# Nested loops Questions

## 1. Hollow Rectangle Pattern:

```
*****
*   *
*   *
*   *
*****
```

## Inverted And Half-Pyramid Pattern:

```
public class HollowRectangle {
    public static void main(String[] args) {
        int n = 5;

        for (int line = 0; line < n; line++) {
            for (int star = 0; star < n; star++) {
                if (line == 0 || star == 0 || line == n - 1 || star == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
```
