// Program that Uses the HealthProfile Class

// Beginning of the Program

// Import the Scanner Class
import java.util.Scanner;

public class HealthProfileTest
{
    public static void main(String[] args)
    {
        // Create a HealthProfile Object Using the Constructor

        HealthProfile patient1 = new HealthProfile(
            "John",
            "Smith",
            "Male",
            11,
            3,
            2003,
            1.80,
            80.0
        );

        // Test the Getter Methods

        System.out.printf(
            "The patient %s %s is %s, was born on %d/%d/%d, is %.2f meters tall, and weighs %.2f kg.%n",
            patient1.getFirstName(),
            patient1.getLastName(),
            patient1.getGender(),
            patient1.getBirthDay(),
            patient1.getBirthMonth(),
            patient1.getBirthYear(),
            patient1.getHeight(),
            patient1.getWeight()
        );

        // Test Heart Rate Methods

        System.out.printf(
            "The maximum heart rate the patient can reach is %.2f bpm, and the recommended target heart rate range is %s.%n",
            patient1.calculateMaximumHeartRate(),
            patient1.calculateTargetHeartRateRange()
        );

        // Test BMI Calculation

        System.out.printf(
            "The patient's BMI is %.2f.%n%n",
            patient1.calculateBMI()
        );

        // Create a New Patient to Test the Setter Methods

        HealthProfile patient2 = new HealthProfile();

        // Create a Scanner Object

        Scanner input = new Scanner(System.in);

        // Use Setter Methods

        System.out.print("Enter the patient's first name: ");
        String firstName = input.nextLine();
        patient2.setFirstName(firstName);

        System.out.print("Enter the patient's last name: ");
        String lastName = input.nextLine();
        patient2.setLastName(lastName);

        System.out.print("Enter the patient's gender: ");
        String gender = input.nextLine();
        patient2.setGender(gender);

        System.out.print("Enter the patient's birth day: ");
        int birthDay = input.nextInt();
        patient2.setBirthDay(birthDay);

        System.out.print("Enter the patient's birth month: ");
        int birthMonth = input.nextInt();
        patient2.setBirthMonth(birthMonth);

        System.out.print("Enter the patient's birth year: ");
        int birthYear = input.nextInt();
        patient2.setBirthYear(birthYear);

        System.out.print("Enter the patient's height (m): ");
        double height = input.nextDouble();
        patient2.setHeight(height);

        System.out.print("Enter the patient's weight (kg): ");
        double weight = input.nextDouble();
        patient2.setWeight(weight);

        System.out.println();

        // Close the Scanner

        input.close();

        // Verify the Setter Methods

        System.out.printf(
            "The patient %s %s is %s, was born on %d/%d/%d, is %.2f meters tall, and weighs %.2f kg.%n",
            patient2.getFirstName(),
            patient2.getLastName(),
            patient2.getGender(),
            patient2.getBirthDay(),
            patient2.getBirthMonth(),
            patient2.getBirthYear(),
            patient2.getHeight(),
            patient2.getWeight()
        );

        System.out.printf(
            "The maximum heart rate the patient can reach is %.2f bpm, and the recommended target heart rate range is %s.%n",
            patient2.calculateMaximumHeartRate(),
            patient2.calculateTargetHeartRateRange()
        );

        System.out.printf(
            "The patient's BMI is %.2f.%n",
            patient2.calculateBMI()
        );
    }
}

// End of the Program
