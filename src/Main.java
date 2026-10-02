public class Main {

    // Normalizes raw string: trims spaces, converts first 3 characters to uppercase
    public static String normalizeCode(String raw) {
        if (raw == null) {
            return "";
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    // Validates the code and returns the formatted output or error message
    public static String validateAndFormat(String code) {
        // Check length
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        // Validate first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: non-letter publisher code";
            }
        }

        // Validate remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        // Extract components
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        // Build formatted string using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] ")
                .append("YEAR: ").append(year)
                .append(" | CATALOG: ").append(catalog);

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test case from sample input/output
        String rawInput = " pen2026004251 ";
        String normalized = normalizeCode(rawInput);
        String result = validateAndFormat(normalized);

        System.out.println(result);
        // Output: [PEN] YEAR: 2026 | CATALOG: 004251
    }
}