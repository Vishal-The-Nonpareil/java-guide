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

#### Syntax:-

```
// Equal ( == )
int A = 10, B = 5;
System.out.println(A==B); // false

int a = 10, b = 10;
System.out.println(a==a); // true

// Not equal to (inequality) ( != )
int A = 10, B = 5;
System.out.println(A != B); // True

int a = 10, b = 10;
System.out.println(a != b); // false

// Greaterthan ( > )
int A = 10, B = 5;
System.out.println(A>B); // True

int a = 20, b = 50;
System.out.println(a>b); // False
```

## 3. Logical Operators

> `&&` (Logical AND)

> `||` (Logical OR)

> `!` (Logical NOT)

### 1. `&&` Logical AND Operator:-

| Ans      | Statement 1 | Statement 2 |
| :------- | :---------: | ----------: |
| **True** |  **True**   |    **True** |
| False    |    True     |       False |
| False    |    False    |        True |
| False    |    False    |       False |

#### Syntax:

```
public class LogicalAND{
  public static void main (String args[]){
    System.out.println( (3>2) && (5>1) );
  }
}
```

**Output: **

TRUE

### 2. `||` Logical OR Operator (Pipe Operator):-

| Ans       | Statement 1 | Statement 2 |
| :-------- | :---------: | ----------: |
| True      |    True     |        True |
| True      |    True     |       False |
| True      |    False    |        True |
| **False** |  **False**  |   **False** |

#### Syntax:

```
public class LogicalOR{
  public static void main (String args[]){
    System.out.println( (3<2) || (5<0) );
  }
}
```

**Output: **

False

### 3. `!` Logical NOT Operator:-

| Ans   | Statement |
| :---- | --------: |
| False |      True |
| True  |     False |

#### Syntax:

```
public class LogicalNOT{
  public static void main (String args[]){
    System.out.println( !(3<2) );
  }
}
```

**Output: **

False

## Operator Precedence

Operator precedence determines the order in which the operators in an expression are evaluated.

For eg :–

`int x = 3 * 4 - 1;`

In the above example, the value of `x` will be **11**, not **9**.This happens because the precedence of `*`operator is higher than`-`operator. That is why the expression is evaluated as `(3*4) - 1` and not `3 * (4 - 1)` .

## Operator Precedence Table

| Operators                                | Precedence                                                      |
| ---------------------------------------- | --------------------------------------------------------------- |
| postfix increment and decrement          | `++` `--`                                                       |
| prefix increment and decrement, andunary | `++` `--` `+` `-` `~` `!`                                       |
| multiplicative                           | `*` `/` `%`                                                     |
| additive                                 | `+` `-`                                                         |
| shift                                    | `<<` `>>` `>>>`                                                 |
| relational                               | `<` `>` `<=` `>=` `instanceof`                                  |
| equality                                 | `==` `!=`                                                       |
| bitwise AND                              | `&`                                                             |
| bitwise exclusive OR                     | `^`                                                             |
| bitwise inclusive OR                     | `\|`                                                            |
| logical AND                              | `&&`                                                            |
| logical OR                               | `\|\|`                                                          |
| ternary                                  | `?:`                                                            |
| assignment                               | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `\|=` `<<=` `>>=` `>>>=` |

## Associativity of Operators

> If an expression has two operators with similar precedence,the expression is evaluated according to its **associativity** (either left to right, or right to left).

| Operators                                 |                           Precedence                            | Associativity |
| :---------------------------------------- | :-------------------------------------------------------------: | ------------: |
| postfix increment anddecrement            |                            `++` `--`                            | left to right |
| prefix incr ement anddecrement, and unary |                    `++` `--` `+` `-` `~` `!`                    | right to left |
| multiplicative                            |                           `*` `/` `%`                           | left to right |
| additive                                  |                             `+` `-`                             | left to right |
| shift                                     |                         `<<` `>>` `>>>`                         | left to right |
| relational                                |                 `<` `>` `<=` `>=` `instanceof`                  | left to right |
| equality                                  |                            `==` `!=`                            | left to right |
| bitwise AND                               |                               `&`                               | left to right |
| bitwise exclusive OR                      |                               `^`                               | left to right |
| bitwise inclusive OR                      |                              `\|`                               | left to right |
| logical AND                               |                              `&&`                               | left to right |
| logical OR                                |                             `\|\|`                              | left to right |
| ternary                                   |                              `?:`                               | right to left |
| assignment                                | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `\|=` `<<=` `>>=` `>>>=` | right to left |
