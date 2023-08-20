# Loops

#### Repeat == Loops

> Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true. Java provides three ways for executing the loops.

- ava provides three ways for executing the loops.

### 1. while loop

### 2. for loop

### 3. do while loop

## 1. while loop:

A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement.

#### Syntax:

```
while(condition){
    // do something
}
```

#### Print Hello world 100 times:

```
public class HelloWorld100times {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 100) {
            System.out.println("Hello World");
            counter++;
        }
    }
}
```

#### Print number from 1 to 10:

```
public class PrintNumber1to10 {
    public static void main(String[] args) {
        int number = 1;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
    }

}
```

#### Sum Of first n natural number:

```
import java.util.Scanner;

public class SumOfFirstnNaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("sum is " + sum);

        sc.close();
    }
}
```

## 2. for loop:

for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping

#### Syntax:

```
for(initialisation;condition;updation){

    // do something

}
```

#### Print Hello world 100 times using fro loop:

```
public class forLoop1 {
    public static void main(String[] args) {
        // int i = 1;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello world");
        }
    }

}
```

#### Print square pattern:

```
public class PrintSquarePattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
    }

}
```

#### Print reverse of a number:

number = 132/10 == remove lastdegit

then, remainder = lastdigit;

132%10 == 2

```
public class PrintReverseNumber {
    public static void main(String[] args) {
        int n = 6416;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n /= 10;
        }
    }

}
```

#### Reverse the given number:

reverse = (reverse\*10) + lastDigit

```
public class ReverseTheGivenNumber {
    public static void main(String[] args) {
        int n = 10225;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }

}
```

## 3. do while loop:

do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.

#### Syntax:

`do{
    // do something
}
while(condition)`

```
public class doWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Hello World");
            i++;
        } while (i <= 10);
    }

}
```

## break statement:

to exit the loop

```
public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }

}
```

```
import java.util.Scanner;

public class BreakStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        } while (true);

        sc.close();
    }

}
```

### continue statement:

to skip an iteration

```
public class ContinueStatement {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

}
```

### Display all number entered by user except multiple of 10:

#### [CheckSolution](<https://github.com/Vishal-The-Nonpareil/java-guide/blob/main/7.0.Loops-(Flow-Control)/exceptMultipleOf10.java>)

### Check if a number is prime or not:

#### [CheckSolution](<https://github.com/Vishal-The-Nonpareil/java-guide/blob/main/7.0.Loops-(Flow-Control)/NumIsPrimeOrNot.java>)
