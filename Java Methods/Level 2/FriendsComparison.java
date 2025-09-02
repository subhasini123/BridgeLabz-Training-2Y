// File name: FriendsComparison.java
import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        // Display results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
