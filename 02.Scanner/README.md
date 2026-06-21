# Scanner

This project demonstrates how to use the `Scanner` class in Java to receive input from the user through the command line.

User input is an essential part of most software applications. Whether collecting a username, age, configuration settings, or any other information, programs often need to interact with users and process the data they provide.

## Learning Objectives

This project aims to demonstrate:

- User interaction through the terminal
- Importing Java classes
- Creating objects
- Reading text input with `nextLine()`
- Reading numeric input with `nextInt()`
- Storing user input in variables
- Displaying formatted output with `printf()`

## File

### RPGCharacter.java

A simple application that creates a basic RPG character sheet based on information provided by the user.

The program requests:

- Character name
- Character class
- Character level

After receiving the information, it displays a formatted character sheet.

### Example Execution

```text
Enter the character's name: Aragon

Enter the character's class: Warrior

Enter the character's starting level: 5

Character Sheet
----------------
Name: Aragon
Class: Warrior
Level: 5
```

## Concepts Covered

- Classes and Objects
- Scanner Class
- Variables
- Strings
- Integers
- User Input
- Console Output
- Formatted Output
- Basic Program Structure

## Scanner Class

To use the Scanner class, it must first be imported:

```java
import java.util.Scanner;
```

Then, a Scanner object can be created:

```java
Scanner input = new Scanner(System.in);
```

This object is responsible for reading data entered through the keyboard.

Some commonly used methods include:

| Method | Description |
|----------|-------------|
| `nextLine()` | Reads an entire line of text |
| `next()` | Reads a single word |
| `nextInt()` | Reads an integer |
| `nextDouble()` | Reads a decimal number |
| `nextBoolean()` | Reads a boolean value |

## How to Run

Compile the program:

```bash
javac RPGCharacter.java
```

Run the program:

```bash
java RPGCharacter
```

## Related Topics

This project builds upon the concepts introduced in the **Print, Println and Printf** examples and serves as an introduction to user interaction in Java applications.
