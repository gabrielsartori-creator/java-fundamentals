# Grade Average Calculator

This project demonstrates the use of the `while` loop and **sentinel-controlled repetition** in Java through the implementation of a simple grade average calculator.

The application repeatedly asks the user to enter students' grades until a sentinel value is provided. It then calculates and displays the average grade of the class.

Its primary purpose is educational, serving as a practical introduction to repetition structures and user-controlled program execution.

## Learning Objectives

This project aims to demonstrate:

* `while` Loops
* Sentinel-Controlled Repetition
* Variables
* Integer Arithmetic
* User Input with `Scanner`
* Console Output
* Accumulators
* Counters
* Average Calculation

## Project Structure

```text
05. While/
│
├── GradeAverage.java
└── README.md
```

## Files

### GradeAverage.java

Contains the complete application responsible for:

* Reading grades entered by the user
* Repeating the input process using a `while` loop
* Detecting the sentinel value (`-1`)
* Accumulating the sum of all grades
* Counting the number of students
* Calculating and displaying the class average

## Repetition Structure

### while

The `while` statement repeatedly executes a block of code while a given condition remains true.

Example:

```java
while (grade != -1)
{
    ...
}
```

This type of loop is particularly useful when the number of iterations is unknown before the program starts.

## Sentinel-Controlled Repetition

A sentinel is a special value used to indicate when a repetition should stop.

In this project, the value `-1` acts as the sentinel.

Whenever the user enters `-1`, the loop terminates and the program calculates the class average.

## Example Output

```text
Enter a grade (-1 if there are no more grades to enter): 85
Enter a grade (-1 if there are no more grades to enter): 72
Enter a grade (-1 if there are no more grades to enter): 91
Enter a grade (-1 if there are no more grades to enter): 68
Enter a grade (-1 if there are no more grades to enter): -1

The class average is 79.00.
```

## Concepts Covered

* Variables
* Integer Arithmetic
* `while` Loops
* Sentinel-Controlled Repetition
* User Input
* Console Output
* Counters
* Accumulators
* Average Calculation

## How to Run

Compile the project:

```bash
javac GradeAverage.java
```

Run the application:

```bash
java GradeAverage
```

## Related Topics

This project builds upon previous examples involving conditional statements by introducing repetition structures that allow a program to execute the same task multiple times.

It serves as a foundation for more advanced topics such as:

* Counter-Controlled Repetition
* `for` Loops
* `do-while` Loops
* Nested Loops
* Input Validation
* Methods
