public class Solution {

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[(i - d + n) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
            
        }
    }
}
