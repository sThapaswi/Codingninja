import java.util.* ;
import java.io.*; 
public class Solution {
    public static String writeAsYouSpeak(int n) {
        // Initialize the sequence with "1"
        String sequence = "1";

        // Perform N iterations
        for (int i = 1; i < n; i++) {
            StringBuilder newSequence = new StringBuilder();
            char currentChar = sequence.charAt(0);
            int count = 1;

            // Process each character in the sequence
            for (int iio = 1; iio < sequence.length(); iio++) {
                if (sequence.charAt(iio) == currentChar) {
                    // Increment the count if the character is the same as the current one
                    count++;
                } else {
                    // Append the count and current character to the new sequence
                    newSequence.append(count);
                    newSequence.append(currentChar);

                    // Update current character and reset count
                    currentChar = sequence.charAt(iio);
                    count = 1;
                }
            }

            // Append the count and current character for the last group
            newSequence.append(count);
            newSequence.append(currentChar);

            // Update the sequence for the next iteration
            sequence = newSequence.toString();
        }

        return sequence;
    }
}
