import java.util.*;

public class Solution {
    public static int kthSmallest(int[] arr, int n, int k) {
        if (k < 1 || k > n) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Arrays.sort(arr);
        return arr[k - 1];
    }
}