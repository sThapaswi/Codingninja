public class Solution {
    public static int[] rotateArray(int[] a, int x, String dir) {
        int n = a.length;
        int[] result = new int[n];

        if (dir.equals("LEFT")) {
            x = x % n; // Handle cases where x is greater than the array size
            for (int i = 0; i < n; i++) {
                int newIndex = (i + x) % n;
                result[i] = a[newIndex];
            }
        } else if (dir.equals("RIGHT")) {
            x = x % n; // Handle cases where x is greater than the array size
            for (int i = 0; i < n; i++) {
                int newIndex = (i - x + n) % n;
                result[i] = a[newIndex];
            }
        } else {
            // Handle invalid direction
            return null;
        }

        return result;
    }
}
