# Functions/Methods

In Java, methods are reusable blocks of code that perform specific tasks. They are an essential part of Java programming and help to reduce code duplication and improve code maintainability. Methods can be called from anywhere in the program and can take in parameters, and return values.

## Creating Methods in Java:

> In Java, a method is a block of code that performs a specific task and can be reused throughout the program. A method is a subroutine or a function, which may or may not return a value.

#### Syntax:

```
access_modifier return_type method_name (parameter_list) {
   // method body
}
```

- Access modifiers specify the level of access to the method. It can be public, private, protected, or default.

- Return type indicates the type of value the method returns. If the method does not return any value, the return type is void.

- Method name is the name that is used to refer to the method throughout the program.

- Parameter list contains the input parameters that the method can accept. It can be empty if the method does not take any input.

#### Example:

```
public class FunctionCode {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static void main(String[] args) {
        printHelloWorld();
    }

}
```

```
public int sum(int a, int b) {
   int result = a + b;
   return result;
}
```

This method takes two integer parameters, a and b, and returns the sum of these two integers as an integer value.

Methods help in organizing code and improve code readability, reusability, and maintenance. They allow us to break down the program into smaller, manageable parts that can be easily tested and debugged.

## Method parameters and their use:

> method can take zero or more parameters when it is called. Parameters are used to pass values or reference types to a method. Method parameters are declared within the parentheses of the method signature.
>
> A method can have multiple parameters, and each parameter is separated by a comma. Parameters can have any data type, including primitives, objects, or arrays. When a method is called, the arguments provided to the method must match the parameter types and order of the method declaration.

#### Example:

```
public static int add(int a, int b) {
    return a + b;
}
```

#### This method can be called with two integer arguments like this:

```
int result = add(2, 3); // result is 5
```

#### Method With Parameters: [View Code](https://github.com/Vishal-The-Nonpareil/java-guide/edit/main/9.0.Functionds-And-Methods/MethodWithParameter.java/)

```
import java.util.Scanner;

public class MethodWithParameter {

    public static void calSum(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        calSum(a, b);
    }

}
```

- In addition to traditional parameters, Java also supports varargs (variable-length arguments) that allow methods to take a variable number of arguments of the same type. The syntax for varargs is to use three dots (...) after the type of the last parameter, like this:

```
public static int sum(int... numbers) {
    int total = 0;
    for (int n : numbers) {
        total += n;
    }
    return total;
}
```

**This method can be called with any number of integer arguments, like this:**

```
int result = sum(1, 2, 3); // result is 6
result = sum(4, 5, 6, 7); // result is 22
```

Method parameters are an essential concept in Java, as they allow methods to take inputs and produce results based on those inputs.
