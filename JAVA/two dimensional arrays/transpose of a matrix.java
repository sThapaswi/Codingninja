import java.util.* ;
import java.io.*; 
 
public class Solution {

    public static int[][] transpose(int m, int n, int[][] mat) {
        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Swap rows and columns to transpose the matrix
                transposedMatrix[j][i] = mat[i][j];
            }
        }

        return transposedMatrix;
    }
}
