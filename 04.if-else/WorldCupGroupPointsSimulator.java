// Program that Simulates the Standings of a World Cup Group

// Beginning of the Program

import java.util.Scanner;

public class WorldCupGroupPointsSimulator
{
    public static void main(String[] args)
    {
        // Create the Scanner
        Scanner input = new Scanner(System.in);

        // Declare the Points of the Group C Teams

        int brazilPoints = 0;
        int haitiPoints = 0;
        int moroccoPoints = 0;
        int scotlandPoints = 0;

        // Ask the User for the Result of Each Match

        System.out.print("Enter the result of Brazil vs. Morocco (0: Draw, 1: Brazil, 2: Morocco): ");
        int matchResult = input.nextInt();

        if (matchResult == 0)
        {
            brazilPoints += 1;
            moroccoPoints += 1;
        }
        else if (matchResult == 1)
        {
            brazilPoints += 3;
        }
        else if (matchResult == 2)
        {
            moroccoPoints += 3;
        }
        else
        {
            System.out.println("Invalid input! No points were awarded for this match.");
        }

        System.out.print("Enter the result of Haiti vs. Scotland (0: Draw, 1: Haiti, 2: Scotland): ");
        matchResult = input.nextInt();

        if (matchResult == 0)
        {
            haitiPoints += 1;
            scotlandPoints += 1;
        }
        else if (matchResult == 1)
        {
            haitiPoints += 3;
        }
        else if (matchResult == 2)
        {
            scotlandPoints += 3;
        }
        else
        {
            System.out.println("Invalid input! No points were awarded for this match.");
        }

        System.out.print("Enter the result of Scotland vs. Morocco (0: Draw, 1: Scotland, 2: Morocco): ");
        matchResult = input.nextInt();

        if (matchResult == 0)
        {
            scotlandPoints += 1;
            moroccoPoints += 1;
        }
        else if (matchResult == 1)
        {
            scotlandPoints += 3;
        }
        else if (matchResult == 2)
        {
            moroccoPoints += 3;
        }
        else
        {
            System.out.println("Invalid input! No points were awarded for this match.");
        }

        System.out.print("Enter the result of Brazil vs. Haiti (0: Draw, 1: Brazil, 2: Haiti): ");
        matchResult = input.nextInt();

        if (matchResult == 0)
        {
            brazilPoints += 1;
            haitiPoints += 1;
        }
        else if (matchResult == 1)
        {
            brazilPoints += 3;
        }
        else if (matchResult == 2)
        {
            haitiPoints += 3;
        }
        else
        {
            System.out.println("Invalid input! No points were awarded for this match.");
        }

        System.out.print("Enter the result of Brazil vs. Scotland (0: Draw, 1: Brazil, 2: Scotland): ");
        matchResult = input.nextInt();

        if (matchResult == 0)
        {
            brazilPoints += 1;
            scotlandPoints += 1;
        }
        else if (matchResult == 1)
        {
            brazilPoints += 3;
        }
        else if (matchResult == 2)
        {
            scotlandPoints += 3;
        }
        else
        {
            System.out.println("Invalid input! No points were awarded for this match.");
        }

        System.out.print("Enter the result of Morocco vs. Haiti (0: Draw, 1: Morocco, 2: Haiti): ");
        matchResult = input.nextInt();

        if (matchResult == 0)
        {
            moroccoPoints += 1;
            haitiPoints += 1;
        }
        else if (matchResult == 1)
        {
            moroccoPoints += 3;
        }
        else if (matchResult == 2)
        {
            haitiPoints += 3;
        }
        else
        {
            System.out.println("Invalid input! No points were awarded for this match.");
        }

        // Close the Scanner
        input.close();

        // Display the Final Standings

        System.out.println("----------- Group C Standings -----------");
        System.out.println("      Team       | Points");
        System.out.println("-----------------|--------");

        System.out.printf("Brazil           | %d%n", brazilPoints);
        System.out.printf("Scotland         | %d%n", scotlandPoints);
        System.out.printf("Haiti            | %d%n", haitiPoints);
        System.out.printf("Morocco          | %d%n", moroccoPoints);
    }
}

// End of the Program
