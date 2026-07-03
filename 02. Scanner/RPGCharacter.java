// Demonstration of the Scanner Class for Receiving User Input

// Program Start

// Import the Scanner Class

import java.util.Scanner;

// Main Class Declaration

public class RPGCharacter
{
    // Main Method Declaration

    public static void main(String[] args)
    {
        // Variable Declarations

        String characterName;   // Stores the Character's Name
        String characterClass;  // Stores the Character's Class
        int characterLevel;     // Stores the Character's Level

        // Create a Scanner Object

        Scanner input = new Scanner(System.in);

        // Receive Information from the User

        // Character Name

        System.out.print("Enter the character's name: ");
        characterName = input.nextLine();

        // Character Class

        System.out.print("Enter the character's class: ");
        characterClass = input.nextLine();

        // Character Level

        System.out.print("Enter the character's starting level: ");
        characterLevel = input.nextInt();

        System.out.println();

        // Close the Scanner

        input.close();

        // Print the Character Sheet

        System.out.println("Character Sheet");
        System.out.println("----------------");
        System.out.printf("Name: %s%n", characterName);
        System.out.printf("Class: %s%n", characterClass);
        System.out.printf("Level: %d%n", characterLevel);
    }

    // End of Main Method

}

// End of Main Class

// End of Program
