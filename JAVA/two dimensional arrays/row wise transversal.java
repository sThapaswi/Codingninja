public class Solution {
    public static int[] printRowWise(int[][] a) {
        int N = a.length; // Number of rows
        int M = a[0].length; // Number of columns
        int[] result = new int[N * M]; // Initialize the result array

        int index = 0; // Initialize the index for the result array

        // Traverse the matrix row-wise
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[index] = a[i][j]; // Store the current element in the result array
                index++; // Increment the result array index
            }
        }

        return result;
    }
}
