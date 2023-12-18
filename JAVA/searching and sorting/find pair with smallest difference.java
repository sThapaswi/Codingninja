import java.util.Arrays;

public class Solution {
    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        int smallestDiff = Integer.MAX_VALUE;

        while (i < n && j < m) {
            int diff = Math.abs(arr1[i] - arr2[j]);

            if (diff < smallestDiff) {
                smallestDiff = diff;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return smallestDiff;
    }
}