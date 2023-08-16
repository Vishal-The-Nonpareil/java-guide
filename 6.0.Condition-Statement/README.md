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
