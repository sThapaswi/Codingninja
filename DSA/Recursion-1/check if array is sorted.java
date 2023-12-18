public class Solution {
    public static boolean arraySortedOrNot(int[] A, int N) {
        if (N <= 1) {
            return true;
        }

        for (int i = 1; i < N; i++) {
            if (A[i] < A[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
