public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Conversion factor from km^3 to mi^3
        double kmToMilesFactor = 0.621371;
        double conversionFactor = Math.pow(kmToMilesFactor, 3);

        // Volume in cubic miles
        double volumeMiles3 = volumeKm3 * conversionFactor;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}

