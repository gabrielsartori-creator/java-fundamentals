// Program for Entering Students' Grades and Calculating the Class Average

// Beginning of the Program

// Imports the Required Class
import java.util.Scanner;

// Main Class
public class GradeAverage
{
    public static void main(String[] args)
    {
        // Initial Definitions

        int grade;
        int sum = 0;
        int studentCounter = 0;
        double average;

        Scanner input = new Scanner(System.in);

        // Processing Phase

        // Reads the First Grade
        System.out.print("Enter a grade (or enter -1 if there are no more grades to enter): ");
        grade = input.nextInt();

        // Sentinel-Controlled Input
        if (grade != -1)
        {
            sum += grade;
            studentCounter += 1;

            while (grade != -1)
            {
                System.out.print("Enter a grade (or enter -1 if there are no more grades to enter): ");
                grade = input.nextInt();

                if (grade != -1)
                {
                    sum += grade;
                    studentCounter += 1;
                }
            }
        }
        else
        {
            System.out.println("No grades were entered!");
        }

        // Calculates and Displays the Average

        if (studentCounter > 0)
        {
            average = (double) sum / studentCounter;

            System.out.printf("The class average is %.2f.%n",
                average);
        }

        // Closes the Scanner
        input.close();
    }
}

// End of the Program
