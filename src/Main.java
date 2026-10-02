public class Main {

    public static void parseInventoryRecord(String csvLine) {
        // Split the CSV line by comma
        String[] fields = csvLine.split(",");

        // Validate that exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            // Extract fields
            String productName = fields[0];
            String sku = fields[1];
            String quantity = fields[2];

            // Print formatted record
            System.out.println("Product: " + productName + " | SKU: " + sku + " | Qty: " + quantity);
        }
    }

    public static void main(String[] args) {
        // Test cases from sample input/output
        parseInventoryRecord("Wireless Mouse,WM-2201,150"); // Output: Product: Wireless Mouse | SKU: WM-2201 | Qty: 150
        parseInventoryRecord("Wireless Mouse,150");         // Output: Invalid Record
    }
}