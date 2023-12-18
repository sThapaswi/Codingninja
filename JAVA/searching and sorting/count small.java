public class Solution {
    public static int[] countS(int n, int m, int[] a, int[] b) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (b[j] <= a[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 0};
        int[] B = {5, 1};
        int[] result = countS(A.length, B.length, A, B);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
