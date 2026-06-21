# OOP Health Profile

This project demonstrates fundamental Object-Oriented Programming (OOP) concepts in Java through the implementation of a simple health profile system.

The application simulates a basic medical record by storing personal information and providing methods to access and manipulate that data. Its primary purpose is educational, serving as a practical introduction to classes, objects, encapsulation, constructors, and methods in Java.

## Learning Objectives

This project aims to demonstrate:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Instance Variables
- Constructors
- Encapsulation
- Getters and Setters
- Business Methods
- Object Interaction

## Project Structure

```text
03-oop-health-profile/
│
├── HealthProfile.java
├── HealthProfileTest.java
└── README.md
```

## Files

### HealthProfile.java

Defines the `HealthProfile` class, which represents a simplified health record.

The class stores information such as:

- First Name
- Last Name
- Gender
- Date of Birth
- Height
- Weight

It also contains methods that allow the program to:

- Retrieve stored information
- Modify stored information
- Calculate age
- Calculate Body Mass Index (BMI)
- Estimate maximum heart rate
- Determine target heart rate ranges

### HealthProfileTest.java

Contains the `main()` method responsible for:

- Creating a `HealthProfile` object
- Collecting information from the user
- Displaying the generated health profile
- Demonstrating interaction with the object's methods

## Object-Oriented Programming Concepts

### Class

A class acts as a blueprint for creating objects.

In this project:

```java
public class HealthProfile
```

defines a template from which health profile objects can be created.

### Object

An object is an instance of a class.

Example:

```java
HealthProfile patient = new HealthProfile(...);
```

### Encapsulation

The object's data is stored in private instance variables and accessed through public methods.

Example:

```java
private String firstName;
```

```java
public String getFirstName()
{
    return firstName;
}
```

### Getters and Setters

Getters return values stored within the object.

```java
getFirstName()
```

Setters modify values stored within the object.

```java
setFirstName()
```

### Constructor

Constructors initialize objects when they are created.

Example:

```java
public HealthProfile(...)
{
    ...
}
```

## Example Output

```text
Enter the patient's first name: Miguel
Enter the patient's last name: Silva
Enter the patient's gender: Male
Enter the patient's birth day: 10
Enter the patient's birth month: 1
Enter the patient's birth year: 2006
Enter the patient's height (m): 1.80
Enter the patient's weight (kg): 80

The patient Miguel Silva is Male, was born on 10/1/2006, is 1.80 meters tall, and weighs 80.00 kg.

The maximum heart rate the patient can reach is 200.00 bpm, and the recommended target heart rate range is (100.00 ; 170.00) bpm.

The patient's BMI is 24.69.
```

## Concepts Covered

- Classes
- Objects
- Constructors
- Instance Variables
- Encapsulation
- Getters and Setters
- Methods
- User Input
- Mathematical Calculations
- Object-Oriented Design

## How to Run

Compile the project:

```bash
javac HealthProfile.java HealthProfileTest.java
```

Run the application:

```bash
java HealthProfileTest
```

## Related Topics

This project builds upon previous examples involving user input and output while introducing the core principles of Object-Oriented Programming in Java.

It serves as a foundation for more advanced topics such as:

- Inheritance
- Polymorphism
- Abstract Classes
- Interfaces
- Design Patterns
