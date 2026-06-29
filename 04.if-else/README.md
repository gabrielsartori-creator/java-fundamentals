# World Cup Group Points Simulator

This project demonstrates the use of conditional statements in Java through the implementation of a simple FIFA World Cup group stage simulator.

The application asks the user to enter the result of each match in a four-team group and automatically calculates the points earned by each team according to the standard football scoring system.

Its primary purpose is educational, serving as a practical introduction to decision-making structures using `if`, `else if`, and `else`.

## Learning Objectives

This project aims to demonstrate:

* Conditional Statements (`if`, `else if`, `else`)
* Relational Operators
* Variables
* Integer Arithmetic
* User Input with `Scanner`
* Console Output
* Decision Making
* Sequential Program Execution

## Project Structure

```text
04.if-else/
│
├── WorldCupGroupPointsSimulator.java
└── README.md
```

## Files

### WorldCupGroupPointsSimulator.java

Contains the complete application responsible for:

* Reading match results from the user
* Validating the entered option
* Awarding points according to the match outcome
* Updating each team's score
* Displaying the final Group C standings

## Conditional Statements

### if

The `if` statement executes a block of code only if a condition is true.

Example:

```java
if (matchResult == 0)
{
    brazilPoints += 1;
    moroccoPoints += 1;
}
```

### else if

The `else if` statement checks an additional condition when the previous one is false.

Example:

```java
else if (matchResult == 1)
{
    brazilPoints += 3;
}
```

### else

The `else` block executes when none of the previous conditions are satisfied.

Example:

```java
else
{
    System.out.println("Invalid input! No points were awarded for this match.");
}
```

## Example Output

```text
Enter the result of Brazil vs. Morocco (0: Draw, 1: Brazil, 2: Morocco): 0
Enter the result of Haiti vs. Scotland (0: Draw, 1: Haiti, 2: Scotland): 2
Enter the result of Scotland vs. Morocco (0: Draw, 1: Scotland, 2: Morocco): 1
Enter the result of Brazil vs. Haiti (0: Draw, 1: Brazil, 2: Haiti): 1
Enter the result of Brazil vs. Scotland (0: Draw, 1: Brazil, 2: Scotland): 1
Enter the result of Morocco vs. Haiti (0: Draw, 1: Morocco, 2: Haiti): 1

----------- Group C Standings -----------
      Team       | Points
-----------------|--------
Brazil           | 7
Scotland         | 3
Haiti            | 0
Morocco          | 7
```

## Concepts Covered

* Variables
* Integer Arithmetic
* Relational Operators
* Conditional Statements
* Decision Making
* User Input
* Console Output
* Sequential Execution

## How to Run

Compile the project:

```bash
javac WorldCupGroupPointsSimulator.java
```

Run the application:

```bash
java WorldCupGroupPointsSimulator
```

## Related Topics

This project builds upon previous examples involving user input and output while introducing one of the fundamental concepts of programming: conditional execution.

It serves as a foundation for more topics such as:

* Nested Conditional Statements
* Logical Operators (`&&`, `||`, `!`)
* `switch` Statements
* Loops (`while`, `for`, `do-while`)
* Methods
* Object-Oriented Programming (OOP)


## Observation About Educational Purpose

This project intentionally uses multiple `if`, `else if`, and `else` blocks to reinforce the fundamentals of conditional logic.

Although the repeated logic could be refactored into reusable methods, the current implementation prioritizes readability and learning over code optimization.


