import java.util.Scanner;

public class CalendarDisplay {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // month is 1-12
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to get first day of the month using Zeller’s Congruence
    // Returns 0=Sunday, 1=Monday, ..., 6=Saturday
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // first day
        int m = month;
        int y = year;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;   // year of the century
        int J = y / 100;   // zero-based century

        int h = (d + (13 * (m + 1)) / 5 + K + K/4 + J/4 + 5*J) % 7;
        // h=0 Saturday, 1=Sunday, ..., 6=Friday
        int dayOfWeek = (h + 6) % 7; // convert to 0=Sunday
        return dayOfWeek;
    }

    // Method to print calendar
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(month, year);

        // Print header
        System.out.println("\n     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);

            if ((day + startDay) % 7 == 0) { // move to next line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}
