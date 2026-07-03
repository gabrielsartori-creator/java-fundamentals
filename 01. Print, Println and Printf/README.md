# Print, Println and Printf

This project demonstrates the three most common output methods used in Java:

- `System.out.print()`
- `System.out.println()`
- `System.out.printf()`

Although all three methods are used to display information on the screen, they behave differently and are suitable for different situations.

## Learning Objectives

This project aims to demonstrate:

- Basic console output in Java
- Differences between `print()`, `println()`, and `printf()`
- String output
- Formatted output
- Basic program structure

## Files

### PrintDemo.java

Demonstrates the use of:

```java
System.out.print()
```

This method prints text without moving the cursor to the next line.

Example output:

```text
Some examples of fruits are Orange, Watermelon, Grapes, Pineapple and Strawberry.
```

---

### PrintlnDemo.java

Demonstrates the use of:

```java
System.out.println()
```

This method prints text and automatically moves the cursor to the next line.

Example output:

```text
Number | Square
--------------
1      | 1
2      | 4
3      | 9
...
10     | 100
```

---

### PrintfDemo.java

Demonstrates the use of:

```java
System.out.printf()
```

This method allows formatted output through format specifiers such as:

| Specifier | Description |
|------------|------------|
| `%s` | String |
| `%d` | Integer |
| `%f` | Floating-point number |
| `%c` | Character |
| `%b` | Boolean |

Example output:

```text
John Green is 25 years old!
```

## Concepts Covered

- Console Output
- Strings
- Variables
- Formatted Output
- Java Syntax Fundamentals

## How to Run

Compile a program:

```bash
javac PrintDemo.java
```

Run the program:

```bash
java PrintDemo
```

Repeat the process for:

```text
PrintlnDemo.java
PrintfDemo.java
```

## Related Topics

This project is part of the Java Fundamentals repository and serves as an introduction to user interaction and console-based applications.
