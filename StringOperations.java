import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringOperations {
    public static void main(String[] args) {
        String sampleString = "The quick brown fox jumps over the lazy dog.";

        // i. Compare two strings lexicographically, ignoring case differences.
        String string1 = "apple";
        String string2 = "Banana";
        int result = compareStringsIgnoreCase(string1, string2);
        System.out.println("Comparison result: " + result);

        // ii. Check whether a given string ends with the contents of another string.
        String endString = "dog.";
        boolean endsWith = endsWithIgnoreCase(sampleString, endString);
        System.out.println("Ends with: " + endsWith);

        // iii. Print current date and time in the specified format.
        String dateTime = getCurrentDateTime("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current date and time: " + dateTime);

        // iv. Get the index of all the characters of the alphabet.
        System.out.println("Indices of alphabet characters:");
        printAlphabetIndices();

        // v. Replace each substring of a given string that matches the given regular expression with the given replacement.
        String replacedString = replaceSubstring(sampleString, "fox", "cat");
        System.out.println("Replaced string: " + replacedString);

        // vi. Get a substring of a given string between two specified positions.
        String substring = getSubstring(sampleString, 10, 15);
        System.out.println("Substring: " + substring);

        // vii. Trim any leading or trailing whitespace from a given string.
        String stringWithWhitespace = "   Hello, World!   ";
        String trimmedString = trimWhitespace(stringWithWhitespace);
        System.out.println("Trimmed string: " + trimmedString);

        // viii. Convert all the characters in a string to lowercase.
        String uppercaseString = "HELLO";
        String lowercaseString = convertToLowercase(uppercaseString);
        System.out.println("Lowercase string: " + lowercaseString);

        // ix. Get the length of a given string.
        int stringLength = getStringLength(sampleString);
        System.out.println("String length: " + stringLength);

        // x. Check whether two String objects contain the same data.
        String string3 = "The quick brown fox jumps over the lazy dog.";
        boolean sameData = hasSameData(sampleString, string3);
        System.out.println("Same data: " + sameData);
    }

    public static int compareStringsIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2);
    }

    public static boolean endsWithIgnoreCase(String mainString, String endString) {
        return mainString.toLowerCase().endsWith(endString.toLowerCase());
    }

    public static String getCurrentDateTime(String format) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return currentDateTime.format(formatter);
    }

    public static void printAlphabetIndices() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char ch : alphabet.toCharArray()) {
            int index = Character.toLowerCase(ch) - 'a';
            System.out.println(ch + ": " + index);
        }
    }

    public static String replaceSubstring(String mainString, String regex, String replacement) {
        return mainString.replaceAll(regex, replacement);
    }

    public static String getSubstring(String mainString, int startIndex, int endIndex) {
        return mainString.substring(startIndex, endIndex);
    }

    public static String trimWhitespace(String inputString) {
        return inputString.trim();
    }

    public static String convertToLowercase(String inputString) {
        return inputString.toLowerCase();
    }

    public static int getStringLength(String inputString) {
        return inputString.length();
    }

    public static boolean hasSameData(String string1, String string2) {
        return string1.equals(string2);
    }
}
