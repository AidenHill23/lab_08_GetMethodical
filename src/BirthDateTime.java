import java.util.Scanner;

class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        int year = SafeInput.getRangedInt(scanner, "Enter the year of birth ", 1950, 2015);

        // Input month
        int month = SafeInput.getRangedInt(scanner, "Enter the month of birth (1-12) ", 1, 12);

        // Input day
        int maxDaysInMonth;
        switch (month) {
            case 2: // February
                maxDaysInMonth = 29; // Assuming leap years allowed
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                maxDaysInMonth = 30;
                break;
            default: // January, March, May, July, August, October, December
                maxDaysInMonth = 31;
        }
        int day = SafeInput.getRangedInt(scanner, "Enter the day of birth ", 1, maxDaysInMonth);

        // Input hours
        int hours = SafeInput.getRangedInt(scanner, "Enter the hour of birth (1-24) ", 1, 24);

        // Input minutes
        int minutes = SafeInput.getRangedInt(scanner, " ", 1, 59);

        System.out.println("Date and Time of Birth:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hours);
        System.out.println("Minute: " + minutes);

        scanner.close();
    }
}