public class Solution {

    public static void findLargest(int mat[][]){
        int n = mat.length;
        int m = 0;
        int maxSum = Integer.MIN_VALUE;
        String result = "row 0";

        if (n > 0) {
            m = mat[0].length;

            // Calculate the sum of each row and check for the largest sum
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
                for (int j = 0; j < m; j++) {
                    rowSum += mat[i][j];
                }
                if (rowSum > maxSum) {
                    maxSum = rowSum;
                    result = "row " + i;
                }
            }

            // Calculate the sum of each column and check for the largest sum
            for (int j = 0; j < m; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += mat[i][j];
                }
                if (colSum > maxSum) {
                    maxSum = colSum;
                    result = "column " + j;
                }
            }
        }

        System.out.println(result + " " + maxSum);
    }
}
