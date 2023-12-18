public class Solution {

    public static void wavePrint(int mat[][]) {
        int rows = mat.length;
        int cols = (rows > 0) ? mat[0].length : 0;

        for (int i = 0; i < cols; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            } else {
                for (int j = rows - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + " ");
                }
            }
        }
    }
}
