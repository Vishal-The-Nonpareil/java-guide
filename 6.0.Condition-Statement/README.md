# Condition Statement

### 1. if, else

### 2. else if

### 3. Ternary Operator

### 4. Switch

## if-else Statement:

Decision making in java helps to write decission-driven statement and execute a particular set of code based on certain conditions.

The if **statement** alone tellus that if a condition is true it will execute a block of statement and if the condition is ture it won't. But what if we want to do something else if the condition is false. Here comes the **else statement**. We can use else statement with the if statement to execute a block of code when the condition is false.

**Age >= 18 ---> Adult ---> Vote,drive**

#### Syntax:-

```
int age = 22;
if(age>=18){
    System.out.println("Vote, Drive);
}
else{
    System.out.println("Not Adult");
}
```

#### Syntax:-

```
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
```

## else-if Statement:

Decision making in java helps to write decision-driven statement and execute
a particulaer set of code based on certain conditions.

**Java if-else-if leader** is used to decide among multiple options. The **if statement** are executed from the top down. As soon as o0ne of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed. If none of the conditions is true, then the final else statement will be executed.

#### Syntax:-

```
public class elseIf {
    public static void main(String[] args) {
    int age = 13;
    if(age>=18){
        System.out.println("Adult");
    }
    elseIf(age>=13 && age <18){
        System.out.println("Teenager");
    }else{
        System.out.println("Kid");

    }
    }
}
```

### Income Tax Calculator:-

- income < 5 lakh

  > 0% tax

- income between 5 - 10 lakh

  > 20% tax

- income > 10 lakh
  > 30% tax

```
import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax = 0;
        }
        elseIf(income >= 500000 && income < 1000000){
            tax= (int)(income*0.2);

        }
        else{
            tax = (int)(income*0.3);
        }

        System.out.println("Your tax is: " + tax);
    }

}
```

### Print the largest of three:-

```
public class PrintLargestOf3 {
    public static void main(String[] args) {

        int A = 1;
        int B = 3;
        int C = 6;

        if ((A >= B) && (A >= C)) {
            System.out.println("A is the largest of three ");
        } else if (B >= C) {
            System.out.println("B is the largest of three");

        } else {
            System.out.println("C is thhe largest of three");
        }
    }
}
```

## 3. Ternary Operator:

variable `=` condition `?` statement1 `:` statement2`;`

int larger `=` (5>3) `?` 5 `:` 3`;`

String type `=` (5`%`2 `==` 0) `?` "even" `:` "odd"`;`

> Java ternary operator is the only conditional operatror that takes three operands. It's a one-liner replacement for the if-then-else statement and is used a lot in java programming. we can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators. Although it follows the same algorithm as of if-else statement, the conditional operator takes less space and helps to write the if-else statement in the shortest way possible.

**Variable** = **Expression** `?` **Expression2** `:` **Expression3**

#### Syntax:-

```
public class TernaryOperator {
    public static void main(String[] args) {
        int number = 5;

        // ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
```

### Check if a student will pass or fail:

marks >= 33 : PASS

marks < 33 : FAIL

#### Syntax:

```
import java.util.*;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();

        // Ternary operator
        String Result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println("You are " + Result);
    }
}
```

## Switch Statement:

#### syntax:-

```
Switch(variable){
    case1 :
            break;
    case2 :
            break;
    case3 :
            break;
    case4 :
            break;
    default:
}
```
