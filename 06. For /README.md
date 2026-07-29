# Bank Analysis

This project demonstrates the use of the `for` loop and counter-controlled repetition in Java through the implementation of a simple investment comparison simulator.

The application asks the user to provide an initial investment amount, the annual interest rates for a CDB and a savings account, and the number of years to be simulated. It then calculates and displays the projected balance of both investments for each year.

Its primary purpose is educational, serving as a practical introduction to repetition structures with a known number of iterations and the application of compound interest calculations in Java.

## Learning Objectives

This project aims to demonstrate:

* `for` Loops
* Counter-Controlled Repetition
* Variables
* Floating-Point Arithmetic
* User Input with `Scanner`
* Console Output
* Formatted Output with `printf()`
* Percentage Conversion
* Compound Interest Calculations
* Mathematical Operations with `Math.pow()`

## Project Structure

```text
06. For/
│
├── BankAnalysis.java
└── README.md
```

## Files

### BankAnalysis.java

Contains the complete application responsible for:

* Reading the number of years to simulate
* Reading the initial investment amount
* Reading the annual CDB interest rate
* Reading the annual savings account interest rate
* Converting percentage rates into decimal values
* Repeating the calculation through a `for` loop
* Calculating the projected balance for each year
* Displaying a comparison table for both investments

## Repetition Structure

### for

The `for` statement repeatedly executes a block of code while its control condition remains true.

Its structure contains three main components:

```java
for (initialization; condition; update)
{
    ...
}
```

In this project, the loop is defined as:

```java
for (int currentYear = 1; currentYear <= simulatedYears; currentYear++)
{
    ...
}
```

The variable `currentYear`:

* Starts with the value `1`
* Controls the current year of the simulation
* Is incremented by one after each iteration
* Keeps the loop running while it is less than or equal to `simulatedYears`

This type of repetition is particularly useful when the number of iterations is known before the loop begins.

## Counter-Controlled Repetition

Counter-controlled repetition uses a variable to determine how many times a block of instructions should be executed.

In this project, `currentYear` acts as the control variable.

Whenever one iteration is completed, its value is incremented:

```java
currentYear++
```

The process continues until all the years requested by the user have been simulated.

## Compound Interest Calculation

The application calculates the projected balance using the compound interest formula:

```text
Updated Balance = Initial Investment × (1 + Rate)ⁿ
```

In Java, this calculation is implemented using `Math.pow()`:

```java
updatedCdbBalance =
    initialInvestment * Math.pow(1 + cdbRate, currentYear);

updatedSavingsBalance =
    initialInvestment * Math.pow(1 + savingsRate, currentYear);
```

The exponent represented by `currentYear` determines how many years of compound growth are included in each calculation.

## Percentage Conversion

The interest rates are entered by the user as percentages.

Before performing the calculations, the program converts them into decimal values:

```java
cdbRate /= 100.0;
savingsRate /= 100.0;
```

For example, an annual rate of `10%` is converted into:

```text
0.10
```

## Example Output

```text
Enter the number of years you want to simulate: 5
Enter the initial investment amount (R$): 1000
Enter the annual CDB rate (%): 10
Enter the annual savings account rate (%): 6

---------------------------------------------------------------
                Year          CDB Balance      Savings Balance
---------------------------------------------------------------
                   1              1100.00              1060.00
                   2              1210.00              1123.60
                   3              1331.00              1191.02
                   4              1464.10              1262.48
                   5              1610.51              1338.23

Simulation ended!
```

## Concepts Covered

* Variables
* Floating-Point Arithmetic
* `for` Loops
* Counter-Controlled Repetition
* User Input
* Console Output
* Formatted Output
* Percentage Conversion
* Compound Interest
* Exponential Growth
* `Math.pow()`

## Important Note

This project uses the `double` data type to represent monetary values because its main objective is to demonstrate the use of the `for` loop.

However, real financial applications commonly use `BigDecimal`, since floating-point numbers may introduce small precision and rounding differences.

Therefore, this application should be treated as an educational simulation rather than a financial recommendation or a production-ready financial system.

## How to Run

Compile the project:

```bash
javac BankAnalysis.java
```

Run the application:

```bash
java BankAnalysis
```

## Related Topics

This project builds upon previous examples involving repetition structures by introducing a loop controlled by a counter and a known number of iterations.

It serves as a foundation for more topics such as:

* `while` Loops
* `do-while` Loops
* Nested Loops
* Input Validation
* Methods
* Arrays
* Financial Calculations with `BigDecimal`
* Object-Oriented Programming
