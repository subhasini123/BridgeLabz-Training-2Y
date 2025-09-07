public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        // This line will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: text is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("🔴 Demonstrating NullPointerException:");
        try {
            generateException(); // This will crash unless handled
        } catch (NullPointerException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🟢 Handling NullPointerException gracefully:");
        handleException(); // This handles the exception safely
    }
}
