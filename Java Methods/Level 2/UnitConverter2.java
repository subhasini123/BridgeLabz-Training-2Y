// File name: UnitConverter.java
public class UnitConverter2 {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to test conversions
    public static void main(String[] args) {
        System.out.println("10 yards = " + convertYardsToFeet(10) + " feet");
        System.out.println("30 feet = " + convertFeetToYards(30) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("100 inches = " + convertInchesToMeters(100) + " meters");
        System.out.println("12 inches = " + convertInchesToCentimeters(12) + " cm");
    }
}

