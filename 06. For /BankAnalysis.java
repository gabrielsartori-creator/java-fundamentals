// Program to Compare the Growth of a CDB Investment and a Savings Account

// Program Start

// Import the Scanner Class
import java.util.Scanner;

// Main Class
public class BankAnalysis
{
    public static void main(String[] args)
    {
        // Variable Declarations

        double initialInvestment;

        double cdbRate;
        double savingsRate;

        double updatedCdbBalance;
        double updatedSavingsBalance;

        int simulatedYears;

        // Create the Scanner

        Scanner input = new Scanner(System.in);

        // Input Data

        System.out.print("Enter the number of years you want to simulate: ");
        simulatedYears = input.nextInt();

        System.out.print("Enter the initial investment amount (R$): ");
        initialInvestment = input.nextDouble();

        System.out.print("Enter the annual CDB rate (%): ");
        cdbRate = input.nextDouble();

        System.out.print("Enter the annual savings account rate (%): ");
        savingsRate = input.nextDouble();

        // Convert Percentage Rates

        cdbRate /= 100.0;
        savingsRate /= 100.0;

        // Close the Scanner

        input.close();

        // Print the Header

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%20s %20s %20s%n", "Year", "CDB Balance", "Savings Balance");
        System.out.println("---------------------------------------------------------------");

        // Investment Simulation

        for (int currentYear = 1; currentYear <= simulatedYears; currentYear++)
        {
            updatedCdbBalance = initialInvestment * Math.pow(1 + cdbRate, currentYear);
            updatedSavingsBalance = initialInvestment * Math.pow(1 + savingsRate, currentYear);

            System.out.printf("%20d %20.2f %20.2f%n",
                currentYear,
                updatedCdbBalance,
                updatedSavingsBalance);
        }

        // Final Message

        System.out.println();
        System.out.println("Simulation ended!");
    }
}

// End of the Program
