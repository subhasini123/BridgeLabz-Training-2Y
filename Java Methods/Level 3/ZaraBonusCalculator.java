import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate old salary (5-digit) and years of service for 10 employees
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; // [salary, yearsOfService]

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(15); // service between 1 and 15 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [bonus, newSalary]

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to display results in tabular format and total calculations
    public static void displayResults(int[][] employeeData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-10s %-15s %-15s %-15s %-15s\n",
                "EmpID", "Service", "Old Salary", "Bonus", "New Salary", "Years of Service");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-15.2f %-15.2f %-15.2f %-15d\n",
                    (i + 1), years, (double) oldSalary, bonus, newSalary, years);
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-15.2f %-15.2f %-15.2f\n",
                "TOTAL", "-", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int n = 10; // 10 employees

        // Step 1: Generate salary and service data
        int[][] employeeData = generateEmployeeData(n);

        // Step 2: Calculate bonus and new salary
        double[][] newData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display everything in table
        displayResults(employeeData, newData);
    }
}

