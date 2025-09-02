// File name: UnitConverter.java
public class UnitConverter4 {

    // --- Length Conversions ---
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // --- Temperature Conversions ---
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    // --- Weight Conversions ---
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // --- Volume Conversions ---
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // --- Test Main Method ---
    public static void main(String[] args) {
        // Length
        System.out.println("10 yards = " + convertYardsToFeet(10) + " feet");
        System.out.println("12 inches = " + convertInchesToCentimeters(12) + " cm");

        // Temperature
        System.out.println("98.6°F = " + convertFahrenheitToCelsius(98.6) + " °C");
        System.out.println("37°C = " + convertCelsiusToFahrenheit(37) + " °F");

        // Weight
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
        System.out.println("68 kg = " + convertKilogramsToPounds(68) + " pounds");

        // Volume
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
    }
}

