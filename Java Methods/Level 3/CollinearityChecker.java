public class CollinearityChecker {

    // Method 1: Using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division by zero, use cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1) &&
               (y3 - y2) * (x1 - x3) == (y1 - y3) * (x3 - x2);
    }

    // Method 2: Using area of triangle formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;
        int x3 = 3, y3 = 3;

        System.out.println("Checking collinearity for points ("+x1+","+y1+"), ("+x2+","+y2+"), ("+x3+","+y3+")");

        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (using slope method).");
        } else {
            System.out.println("Points are NOT collinear (using slope method).");
        }

        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (using area method).");
        } else {
            System.out.println("Points are NOT collinear (using area method).");
        }
    }
}
