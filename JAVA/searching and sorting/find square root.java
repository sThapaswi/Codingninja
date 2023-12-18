public class Solution {
    public static int sqrtN(long N) {
        if (N == 0 || N == 1) {
            return (int) N;
        }

        long start = 1;
        long end = N;
        long result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid <= N / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) result;
    }
}
