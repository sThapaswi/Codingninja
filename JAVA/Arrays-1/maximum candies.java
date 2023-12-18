public class Solution {
    public static boolean[] maxCandies(int n, int[] children, int extraCandies) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            children[i] += extraCandies;
        }

        boolean[] result = new boolean[n];
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            if (children[i] >= maxCandies) {
                maxCandies = children[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (children[i] + extraCandies >= maxCandies) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }
}