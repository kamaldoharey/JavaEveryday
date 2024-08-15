import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // Read the integer input

            // Check if the number is positive
            if (number < 1) {
                System.out.println("Please enter a positive integer.");
            } else {
                // Check if the number is prime
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to check if a number is prime.
     * @param num The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }
        // Check for factors from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        return true; // No factors found, it is prime
    }
}
