package app_java_important;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CalanderExamples {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month and year from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt() - 1; // Adjust the month to 0-based indexing
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Create a Calendar instance and set the given month and year
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        // Get the maximum number of days in the given month
        int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Get the day of the week for the first day of the month
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print the calendar header
        System.out.println("      " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Print the leading spaces for the first week
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= maxDays; day++) {
            // Print the day with proper formatting
            System.out.printf("%4d ", day);

            // If the current day is the last day of the week, start a new line
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }

        // Print a new line after the last day of the month
        System.out.println();

        scanner.close();
    }
}
