# Types of Operator

Arithmetic operators are used to perform arithmetic operations on variables and data.
Symbols that tell compiler to perform some operation.

```
sum = a + b;

// a & b == Operands
// + == Operator Expression (Addition)
```

- Arithmetic Operators (Binary/Unary)
  - Binary (`+` `-` `*` `/` `%`)
  - Unary (`++` `--`)
- Relational Operators
- Logical Operators
- Bitwise Operators
- Assignment Operators

## 1. Arithmetic Operators

- **Binary**

It need two operands to perform operation.

> `+`

> `-`

> `*`

> `/`

> `%` (modulo) returns the remainder of the two numbers after division

**Example:**

```
public class ArithmeticOperator {
    public static void main(String[] args) {
        int A = 15;
        int B = 5;
        System.out.println("Addition: " + (A + B));
        System.out.println("Subtraction: " + (A - B));
        System.out.println("Multiply: " + (A * B));
        System.out.println("Addition: " + (A + B));
        System.out.println("Division: " + (A / B));
        System.out.println("Ramainder: " + (A % B));

    }
}
```

- **Unary**

It need only single operands to perform Operation.

> `++` (Increment Operator)

> `--` (Decrement Operator)

**Example:**

```
int a = 5;
a++;
a--;
```

There are two types of Unary Operators

- Pre-Increment: ( ++a )

  a. Value change first

  b. Value use

```
// Pre Increment

int a = 10;
int b = ++a
System.out.println(a); // a = 11
System.out.println(b); // b = 11
```

- Post-Increment: ( a++ )

  a. Value use first

  b. Value change

```
int a = 10;
int b = a++;
System.out.println(a); // a = 10
System.out.println(b); // b = 11
```

- Pre-Decrement: ( --a )

  a. Value change first

  b. Value use

```
// Pre Decrement

int a = 10;
int b = --a
System.out.println(a); // a = 9
System.out.println(b); // b = 9
```

2. Post-Decrement: ( a-- )

   a. Value use first

   b. Value change

```
int a = 10;
int b = a--;
System.out.println(a); // a = 9
System.out.println(b); // b = 10
```

## 2. Relational Operators

> `==` Equal

> `!=` Not Equal

> `>` Greaterthan

> `<` Lessthan

> `>=` Greaterthan Equal

> `<=` Lessthan Equal

## 3. Logical Operators

> `&&` (Logical AND)

> `||` (Logical OR)

> `!` (Logical NOT)
