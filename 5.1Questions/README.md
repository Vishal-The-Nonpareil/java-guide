# OPERATORS QUESTIONS:

## 1. What will be the output of the following programs :

- **First:**

```
public class Test1 {

  public static void main(String[] args) {

  int x = 2, y = 5;

  int exp1 = (x \* y / x);

  int exp2 = (x \* (y / x));

  System.out.println(exp1 + ",");

  System.out.println(exp2);

  }

}
```

- **Second:**

```
public class Test2 {

  public static void main(String[] args) {

  int x = 200, y = 50, z = 100;

  if (x > y && y > z) {

  System.out.println("Hello");

  }
  if (z > y && z < x) {

  System.out.println("Java");

  }

  if ((y + 200) < x && (y + 150) < z) {

  System.out.println("Hello Java");

  }

  }

}
```

- **Third:**

```
public class Test3 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }

}

```

- **Fourth:**

```
public class Test4 {

    public static void main(String[] args) {

        int x = 9, y = 12;

        int a = 2, b = 4, c = 6;

        int exp = 4 / 3 * (x + 34) + 9 * (a + b + c) + (3 + y * (2 + a)) / (a + b * y);

        System.out.println(exp);

    }

}
```

- **Fifth:**

```
public class Test5 {

    public static void main(String[] args) {

        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));

        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);

        System.out.println(exp2);
    }

}
```

---

## Solution1:

- **Output:**

```
5,4
```

## Solution2:

- **Output:**

```
Java
```

## Solution3:

- **Output:**

```
4 0 0
```

## Solution4:

- **Output:**

```
152
```

## Solution5:

- **Output:**

```
20
20
```
