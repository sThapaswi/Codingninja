public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int n = a.length;
        int negativeCount = 0;

        // Count the number of negative numbers in the array
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                negativeCount++;
            }
        }

        // Create a new array to store the rearranged elements
        int[] result = new int[n];
        int negativeIndex = 0;
        int positiveIndex = negativeCount;

        // Fill the new array with negative numbers first, followed by positive numbers
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                result[negativeIndex] = a[i];
                negativeIndex++;
            } else {
                result[positiveIndex] = a[i];
                positiveIndex++;
            }
        }

        return result;
    }
}
