public class Solution {
    public static int[] printColWise(int [][]a) {
        // Write your code here.
        int N = a.length; // Number of rows
        int M = a[0].length; // Number of columns
        int[] result = new int[N * M]; // Initialize the result array

        int index = 0; // Initialize the index for the result array

        // Traverse the matrix column-wise
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                result[index] = a[i][j]; // Store the current element in the result array
                index++; // Increment the result array index
            }
        }

        return result;
    }
}