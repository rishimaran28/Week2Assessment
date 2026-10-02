public class Main {

    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        // Test cases from sample input/output
        checkPinLength("482");   // Prints: Invalid PIN — must be exactly 4 digits.
        checkPinLength("4820");  // Prints: PIN length OK.
    }
}