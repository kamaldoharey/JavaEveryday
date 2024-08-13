import java.util.Scanner; // Import Scanner class to take input from user

public class TotalDaysInMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        // Array to store the number of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ask user to enter the number of months
        System.out.print("Enter the number of months (1-12): ");
        int numberOfMonths = scanner.nextInt(); // Read the number of months from user

        // Check if the input is valid (between 1 and 12)
        if (numberOfMonths < 1 || numberOfMonths > 12) {
            System.out.println("Please enter a valid number of months between 1 and 12."); // Show error message
            return; // Exit the program if input is invalid
        }

        int totalDays = 0; // Variable to store total number of days
        // Loop through the number of months entered by user
        for (int i = 0; i < numberOfMonths; i++) {
            totalDays += daysInMonth[i]; // Add days of each month to totalDays
        }

        // Print the total number of days in the given months
        System.out.println("Total number of days in " + numberOfMonths + " months: " + totalDays);
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
