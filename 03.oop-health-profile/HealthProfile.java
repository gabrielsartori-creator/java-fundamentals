// Program that Defines the HealthProfile Class

// Beginning of the Program

// Import Required External Classes
import java.time.LocalDate;

// Declare the Main Class

public class HealthProfile
{
    // Instance Variables

    private String firstName;
    private String lastName;

    private String gender;

    private int birthDay;
    private int birthMonth;
    private int birthYear;

    private double height;
    private double weight;

    // Constructor

    public HealthProfile(String firstName, String lastName, String gender,
                         int birthDay, int birthMonth, int birthYear,
                         double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        if ("Male".equals(gender) || "Female".equals(gender))
        {
            this.gender = gender;
        }

        if (birthDay > 0 && birthDay <= 31)
        {
            this.birthDay = birthDay;
        }

        if (birthMonth > 0 && birthMonth <= 12)
        {
            this.birthMonth = birthMonth;
        }

        if (birthYear > 1900)
        {
            this.birthYear = birthYear;
        }

        if (height > 0.0)
        {
            this.height = height;
        }

        if (weight > 0.0)
        {
            this.weight = weight;
        }
    }

    public HealthProfile(){}

    // Getter Methods

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getGender()
    {
        return gender;
    }

    public int getBirthDay()
    {
        return birthDay;
    }

    public int getBirthMonth()
    {
        return birthMonth;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    // Setter Methods

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setGender(String gender)
    {
        if ("Male".equals(gender) || "Female".equals(gender))
        {
            this.gender = gender;
        }
    }

    public void setBirthDay(int birthDay)
    {
        if (birthDay > 0 && birthDay <= 31)
        {
            this.birthDay = birthDay;
        }
    }

    public void setBirthMonth(int birthMonth)
    {
        if (birthMonth > 0 && birthMonth <= 12)
        {
            this.birthMonth = birthMonth;
        }
    }

    public void setBirthYear(int birthYear)
    {
        if (birthYear > 1900)
        {
            this.birthYear = birthYear;
        }
    }

    public void setHeight(double height)
    {
        if (height > 0.0)
        {
            this.height = height;
        }
    }

    public void setWeight(double weight)
    {
        if (weight > 0.0)
        {
            this.weight = weight;
        }
    }

    // Method to Calculate Age

    public int calculateAge()
    {
        return (LocalDate.now().getYear() - birthYear);
    }

    // Methods to Calculate Maximum Heart Rate and Target Heart Rate Range

    public double calculateMaximumHeartRate()
    {
        return (220 - calculateAge());
    }

    public String calculateTargetHeartRateRange()
    {
        double minimumHeartRate = 0.50 * calculateMaximumHeartRate();
        double maximumHeartRate = 0.85 * calculateMaximumHeartRate();

        return String.format("(%.2f ; %.2f)", minimumHeartRate, maximumHeartRate);
    }

    // Method to Calculate BMI

    public double calculateBMI()
    {
        return (weight / (height * height));
    }
}

// End of the Program
