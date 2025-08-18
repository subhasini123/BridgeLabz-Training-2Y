import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter the radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        // Ask user to enter the height
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume);

        input.close();
    }
}

