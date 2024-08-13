import java.util.Scanner;

public class TotalDaysInMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter the number of months (1-12): ");
        int numberOfMonths = scanner.nextInt();

        if (numberOfMonths < 1 || numberOfMonths > 12) {
            System.out.println("Please enter a valid number of months between 1 and 12.");
            return;
        }

        int totalDays = 0;
        for (int i = 0; i < numberOfMonths; i++) {
            totalDays += daysInMonth[i];
        }

        System.out.println("Total number of days in " + numberOfMonths + " months: " + totalDays);
        scanner.close();
    }
}
