import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        Scanner scanner = new Scanner(System.in);

        // Step 1: Input salary and years of service with validation
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double empSalary = scanner.nextDouble();

            System.out.print("Years of Service: ");
            double empYears = scanner.nextDouble();

            // Validate input
            if (empSalary <= 0 || empYears < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years >= 0. Please re-enter.");
                i--; // Repeat this iteration
                continue;
            }

            salary[i] = empSalary;
            yearsOfService[i] = empYears;
        }

        // Step 2: Calculate bonus, new salary, totals
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Print per employee bonus details
        System.out.println("\n--- Employee Bonus Summary ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d:\n", (i + 1));
            System.out.printf("  Old Salary: %.2f\n", salary[i]);
            System.out.printf("  Years of Service: %.1f\n", yearsOfService[i]);
            System.out.printf("  Bonus: %.2f\n", bonus[i]);
            System.out.printf("  New Salary: %.2f\n\n", newSalary[i]);
        }

        // Step 4: Print totals
        System.out.println("--- Total Summary ---");
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        scanner.close();
    }
}

