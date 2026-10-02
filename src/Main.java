public class Main {

    public static String reverseEachWord(String sentence) {
        // Split sentence into individual words by space
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Loop through each word and reverse it using StringBuilder
        for (int i = 0; i < words.length; i++) {
            StringBuilder wordSb = new StringBuilder(words[i]);
            result.append(wordSb.reverse().toString());

            // Append space between words (except for the last word)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test case from sample input/output
        String input = "hello club";
        String output = reverseEachWord(input);

        System.out.println(output); // Prints: olleh bulc
    }
}