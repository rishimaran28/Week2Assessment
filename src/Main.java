import java.util.*;

public class Main {

    public static void printFilteredWordFrequency(String feedback) {
        // Set of stop words to filter out
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is", "of", "in"));

        // Normalize: convert to lowercase and remove punctuation (periods and commas)
        String cleaned = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        // Split into words by whitespace
        String[] words = cleaned.split("\\s+");

        // Count frequency of non-stop words
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty() && !stopWords.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Convert map entries to a list for sorting
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Sort entries by frequency count in descending order
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print output
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Test case from sample input/output
        String input = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(input);
    }
}