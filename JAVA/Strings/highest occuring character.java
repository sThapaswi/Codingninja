
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int[] charCount = new int[256]; // Assuming extended ASCII characters

        // Iterate through the string and count character frequencies
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        char highestOccurringChar = '\0'; // Initialize with a null character
        int maxFrequency = 0;

        // Find the character with the highest frequency
        for (char c : str.toCharArray()) {
            if (charCount[c] >= maxFrequency) {
                maxFrequency = charCount[c];
                highestOccurringChar = c;
            }
        }

        return highestOccurringChar;
    }
	}

