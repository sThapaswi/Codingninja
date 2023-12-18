public class Solution {

    public static void spiralPrint(int matrix[][]) {
        int rows = matrix.length;
        int cols = (rows > 0) ? matrix[0].length : 0;

        int rs = 0;
        int cs = 0;
        int re = rows - 1;
        int ce = cols - 1;
        int count = 0;

        while (count < (rows * cols)) {
            for (int i = cs; i <= ce; i++) {
                System.out.print(matrix[rs][i] + " ");
                count++;
            }
            rs++;

            for (int i = rs; i <= re; i++) {
                System.out.print(matrix[i][ce] + " ");
                count++;
            }
            ce--;

            if (rs <= re) {  // Check if there are more rows to print
                for (int i = ce; i >= cs; i--) {
                    System.out.print(matrix[re][i] + " ");
                    count++;
                }
                re--;
            }

            if (cs <= ce) {  // Check if there are more columns to print
                for (int i = re; i >= rs; i--) {
                    System.out.print(matrix[i][cs] + " ");
                    count++;
                }
                cs++;
            }
        }
    }
}
