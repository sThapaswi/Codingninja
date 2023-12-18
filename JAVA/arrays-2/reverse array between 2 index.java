public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int[] arr) {
        if (l < 0 || r >= n || l > r) {
            // Check for invalid input
            return null;
        }

        // Reverse the subarray from L to R
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return arr;
    }
}
